package dh.webapp.mobileapi

import grails.converters.JSON

import com.daily.dailyhotel.User

class UserController { 
	
	def sign_up() {}
	
	static allowedMethods = [sign_up : 'POST']
    def index() {
		
//		def user = User.get(1)
//		render user as JSON;
	}
	
	def save() {
		
		
//		def name = params.name;
//		def email = params.email;
//		def facebook = params.facebook;
//		def phone = params.phone;
//		def password = params.password;
//		def refferalCode = params.refferalCode;
		
		def user = new User(params)
		user.save()
		
		render "Success";

//http://localhost:8080/user/v1/sign_up?name=eugenia&email=test&password=1234&phone=010&refferalCode=0
	
	}
}
