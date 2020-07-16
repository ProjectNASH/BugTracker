function showText(){
	function typeWriter() {
	  if (i < txt.length) {
	    document.getElementById("headerText").innerHTML += txt.charAt(i);
	    i++;
	    setTimeout(typeWriter, speed);
	  }
	};

	var i = 0;
	var txt = 'BugTracker Inc.'; 
	var speed = 200; 
	setTimeout(typeWriter, 500);
};


