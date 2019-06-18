/**
 * 
 */

function getCookieByName(c_name) {
    	    var c_value = document.cookie,
    	        c_start = c_value.indexOf(" " + c_name + "=");
    	    if (c_start == -1) c_start = c_value.indexOf(c_name + "=");
    	    if (c_start == -1) {
    	        c_value = null;
    	    } else {
    	        c_start = c_value.indexOf("=", c_start) + 1;
    	        var c_end = c_value.indexOf(";", c_start);
    	        if (c_end == -1) {
    	            c_end = c_value.length;
    	        }
    	        c_value = unescape(c_value.substring(c_start, c_end));
    	    }
    	    return c_value;
    	}
function redirectMe(role){
	if (role=="M") {

		window.location.href ="dashboardMed.html";
		return;
		
	} 
	
	if (role=="H") {

		window.location.href ="dashboardHotel.html";
		return;
		
	} 
	
	if (role=="P") {

		window.location.href ="dashboardPatient.html";
		return;
		
	}
}

function deleteAllCookies() {
    var cookies = document.cookie.split(";");

    for (var i = 0; i < cookies.length; i++) {
        var cookie = cookies[i];
        var eqPos = cookie.indexOf("=");
        var name = eqPos > -1 ? cookie.substr(0, eqPos) : cookie;
        document.cookie = name + "=;expires=Thu, 01 Jan 1970 00:00:00 GMT";
    }
    window.location.href = "http://localhost:8080/index.html";
}