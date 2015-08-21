package com.daily.dailyhotel

class Bookings {

	Long groupBookingId
	String hotelName
	Date checkIn
	Date checkOut
	Integer depositPrice
	Integer sellingPrice
	Integer deltaPrice
	Integer redeemedPoint
	Integer remainingRooms
	String guestFirstName
	String guestLastName
	String guestEmail
	String guestPhone
	Long confirmedBy
	Character isCanceled
	Date dateCreated
	Date dateUpdated
	User user
	Sale sale

	static belongsTo = [Sale, User]

	static hasOne = [bookingTracking: BookingTracking]
	
	static mapping = {
		depositPrice sqlType: 'mediumint'
		sellingPrice sqlType: 'mediumint'
		deltaPrice sqlType: 'mediumint'
		redeemedPoint sqlType: 'mediumint'
		remainingRooms sqlType: 'mediumint'
		version false
	}

	static constraints = {
		groupBookingId nullable: true
		hotelName maxSize: 45
		guestFirstName maxSize: 45
		guestLastName maxSize: 45
		guestEmail maxSize: 45
		guestPhone maxSize: 45
		isCanceled maxSize: 1
		confirmedBy defaultValue: 0
		isCanceled defaultValue: '0'
	}
}
