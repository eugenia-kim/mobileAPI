package com.daily.dailyhotel

class CodeTimezone {

	String name
	String time
	Date dateCreated
	Date dateUpdated

	static hasMany = [citieses: Cities]

	static mapping = {
		id sqlType: 'mediumint'
		version false
	}

	static constraints = {
		name maxSize: 45
		time nullable: true, maxSize: 45
	}
}
