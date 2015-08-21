package com.daily.dailyhotel

class Hotelier {

	Integer hotelId
	String accountId
	String name
	String email
	String address
	String password
	String hotelPhone
	String managerName
	String managerPhone
	String fax1
	String fax2
	String bizfile
	String createDate
	String updateDate

	static mapping = {
		version false
	}

	static constraints = {
		accountId maxSize: 20
		name maxSize: 45
		email maxSize: 45
		address maxSize: 45
		password maxSize: 44
		hotelPhone maxSize: 45
		managerName nullable: true, maxSize: 45
		managerPhone nullable: true, maxSize: 45
		fax1 maxSize: 45
		fax2 nullable: true, maxSize: 45
		bizfile nullable: true, maxSize: 45
		createDate maxSize: 45
		updateDate maxSize: 45
	}
}
