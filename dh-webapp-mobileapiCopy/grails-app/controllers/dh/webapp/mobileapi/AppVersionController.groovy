package dh.webapp.mobileapi

import com.daily.dailyhotel.AppVersion
import grails.converters.JSON

class AppVersionController {

	static allowedMethods = [index : 'GET']
	
    def index() {
		
		def appVersion = new AppVersion(iosMin: "1.1", iosMax: "1.1", iosUpdateForced: '0', androidMin: "1.2", anodroidMax: "1.1", androidUpdateForced: '0');
		appVersion.save();
		render appVersion as JSON;
	}
	
	def test() {
		
		def appVersion = new AppVersion(iosMin: "1.1", iosMax: "1.1", iosUpdateForced: '0', androidMin: "1.2", anodroidMax: "1.1", androidUpdateForced: '0');
		appVersion.save();
		render appVersion as JSON;
	}
	
	def test2() {
		
		render "test!"
	}
}
