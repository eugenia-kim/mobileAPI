package com.daily.dailyhotel

class BookingVoucher {

	Bookings bookings
	String fax1
	String fax2
	String email
	Date dateCreated
	Date dateUpdated

	static mapping = {
		id column: "bookings_id", generator: 'assigned'
		bookings column: "bookings_id", updateable: false, insertable: false
		version false
	}

	static constraints = {
		bookings unique: true
		fax1 nullable: true, maxSize: 45
		fax2 nullable: true, maxSize: 45
		email nullable: true, maxSize: 45
	}
}
