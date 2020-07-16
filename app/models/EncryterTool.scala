package models

import javax.inject._
import play.api.mvc._
import play.api.i18n._
import play.api.data._
import play.api.data.Forms._

import java.security.MessageDigest
import java.util.Base64
import javax.crypto.Cipher
import javax.crypto.spec.{ IvParameterSpec, SecretKeySpec }

import com.mohiva.play.silhouette.api.crypto.Crypter
import com.mohiva.play.silhouette.api.exceptions.CryptoException
import models.JcaCrypter._



object EncryterTool extends Crypter{
  
  
     val JWT_ENCRYPTION_KEY = sys.env("JWT_ENCRYPTION_KEY")
     
     /*def func() =  {
      val msg = encrypt("Sanjay")
      val msg2 = decrypt(msg)
      //Ok(s"$msg and $msg2")
    }*/

    override def encrypt(value: String): String = {
    val keySpec = secretKeyWithSha256(JWT_ENCRYPTION_KEY, "AES")
    //supported paddings: NOPADDING|PKCS5PADDING|ISO10126PADDING
    //supported key format:ECB|CBC|PCBC|CTR|CTS|CFB|OFB|CFB8|CFB16|CFB24|CFB32|CFB40|CFB48|CFB56|CFB64|OFB8|OFB16|OFB24|OFB32|OFB40|OFB48|OFB56|OFB64|GCM|CFB72|CFB80|CFB88|CFB96|CFB104|CFB112|CFB120|CFB128|OFB72|OFB80|OFB88|OFB96|OFB104|OFB112|OFB120|OFB128
    val cipher = Cipher.getInstance("AES/CTR/NoPadding")
    cipher.init(Cipher.ENCRYPT_MODE, keySpec)
    val encryptedValue = cipher.doFinal(value.getBytes("UTF-8"))
    val version = 1
    Option(cipher.getIV) match {
      case Some(iv) => s"$version-${Base64.getEncoder.encodeToString(iv ++ encryptedValue)}"
      case None     => throw new CryptoException(UnderlyingIVBug)
    }
  }

  /**
   * Decrypts a string.
   *    
   * @param value The value to decrypt.
   * @return The plain text string.
   */
  override def decrypt(value: String): String = {
    value.split("-", 2) match {
      case Array(version, data) if version == "1" => decryptVersion1(data, JWT_ENCRYPTION_KEY)
      case Array(version, _)                      => throw new CryptoException(UnknownVersion.format(version))
      case v                                      => throw new CryptoException(UnexpectedFormat)
    }
  }

  /**
   * Generates the SecretKeySpec, given the private key and the algorithm.
   */
  private def secretKeyWithSha256(privateKey: String, algorithm: String) = {
    val messageDigest = MessageDigest.getInstance("SHA-256")
    messageDigest.update(privateKey.getBytes("UTF-8"))
    // max allowed length in bits / (8 bits to a byte)
    val maxAllowedKeyLength = Cipher.getMaxAllowedKeyLength(algorithm) / 8
    val raw = messageDigest.digest().slice(0, maxAllowedKeyLength)
    new SecretKeySpec(raw, algorithm)
  }

  /**
   * V1 decryption algorithm (AES/CTR/NoPadding - IV present).
   */
  private def decryptVersion1(value: String, privateKey: String): String = {
    val data = Base64.getDecoder.decode(value)
    val keySpec = secretKeyWithSha256(privateKey, "AES")
    val cipher = Cipher.getInstance("AES/CTR/NoPadding")
    val blockSize = cipher.getBlockSize
    val iv = data.slice(0, blockSize)
    val payload = data.slice(blockSize, data.size)
    cipher.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(iv))
    new String(cipher.doFinal(payload), "UTF-8")
  }
}

object JcaCrypter {

  val UnderlyingIVBug = "[Silhouette][JcaCrypter] Cannot get IV! There must be a bug in your underlying JCE " +
    "implementation; The AES/CTR/NoPadding transformation should always provide an IV"
  val UnexpectedFormat = "[Silhouette][JcaCrypter] Unexpected format; expected [VERSION]-[ENCRYPTED STRING]"
  val UnknownVersion = "[Silhouette][JcaCrypter] Unknown version: %s"
}

/**
 * The settings for the JCA crypter.
 *
 * @param key The encryption key.
 */
case class JcaCrypterSettings(key: String)