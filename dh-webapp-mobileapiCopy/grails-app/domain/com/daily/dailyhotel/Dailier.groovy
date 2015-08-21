package com.daily.dailyhotel

class Dailier {

	String email
	String password
	String name
	String phone

	static mapping = {
		version false
	}

	static constraints = {
		email nullable: true, maxSize: 45
		password maxSize: 44
		name nullable: true, maxSize: 45
		phone nullable: true, maxSize: 45
	}
}
