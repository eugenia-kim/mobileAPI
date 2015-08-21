package dh.webapp.mobileapi

import java.text.SimpleDateFormat

class CommonController {

	static allowedMethods = [date : 'GET']
	
    def index() { }
	
	def date() {
		
		Date d1 = new Date();
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/YYYY HH:mm a");
		String formattedDate = df.format(d1);
		
		render formattedDate;
	}
}
