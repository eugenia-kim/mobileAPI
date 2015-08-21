package com.daily.dailyhotel

class Facebook {

	String accessToken
	String ageRange
	String gender
	String birthday
	String locale
	String work
	Date dateCreated
	Date dateUpdated

	static hasOne = [users: User]

	static mapping = {
		version false
	}

	static constraints = {
		accessToken maxSize: 45, unique: true
		ageRange nullable: true, maxSize: 45
		gender nullable: true, maxSize: 45
		birthday nullable: true, maxSize: 45
		locale nullable: true, maxSize: 45
		work nullable: true, maxSize: 45
	}
}
