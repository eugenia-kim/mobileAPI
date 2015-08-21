package com.daily.dailyhotel

class BookingTracking {

	Bookings bookings
	String rank
	Date dateRank
	String review
	Date dateReview

	static mapping = {
		id column: "bookings_id", generator: 'assigned'
		bookings column: "bookings_id", updateable: false, insertable: false
		version false
	}
	
	static constraints = {
		bookings unique: true
		rank nullable: true, maxSize: 45
		review nullable: true, maxSize: 200
	}
}
