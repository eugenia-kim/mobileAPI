package com.daily.dailyhotel

class Countries {

	Short sequence
	String name
	String isoCode
	Date dateCreated
	Date dateUpdated

	static hasMany = [citieses: Cities]

	static mapping = {
		id sqlType: 'smallint'
		version false
	}

	static constraints = {
		sequence unique: true
		name maxSize: 45
		isoCode maxSize: 45
	}
}
