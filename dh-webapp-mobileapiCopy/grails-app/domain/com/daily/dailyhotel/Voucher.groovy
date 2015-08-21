package com.daily.dailyhotel

class Voucher {

	String name
	Date dateCreated
	Date dateUpdated

	static hasMany = [hotels: Hotel]

	static mapping = {
		id sqlType: 'tinyint'
		version false
	}

	static constraints = {
		name nullable: true, maxSize: 45
	}
}
