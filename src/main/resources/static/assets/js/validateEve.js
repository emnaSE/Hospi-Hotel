/**
 * 
 */
function validateResDate(start,end){
	var today = (new Date().getTime());
	if((new Date(start).getTime()) < today || (new Date(start).getTime() >= new Date(end).getTime())) {
		return false;
	}
    return true;
}
