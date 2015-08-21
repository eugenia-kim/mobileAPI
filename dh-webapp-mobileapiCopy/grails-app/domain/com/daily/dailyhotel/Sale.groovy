package com.daily.dailyhotel

class Sale {

	Long sequence
	Short remainingRooms
	Integer fixedPrice
	Integer depositPrice
	Integer sellingPrice
	Integer deltaPrice
	Character visibility
	Date dateSale
	Date dateCreated
	Date dateUpdated
	HotelRoom hotelRoom
	Region region

	static hasMany = [bookingses: Bookings]
	static belongsTo = [HotelRoom, Region]

	static mapping = {
		dateSale sqlType: 'date'
		depositPrice sqlType: 'mediumInt'
		sellingPrice sqlType: 'mediumInt'
		deltaPrice sqlType: 'mediumInt'
		fixedPrice sqlType: 'mediumInt'
		version false
	}

	static constraints = {
		visibility maxSize: 1, defaultValue: 1
		depositPrice defaultValue: 0
		sellingPrice defaultValue: 0
		deltaPrice defaultValue: 0
		fixedPrice defaultValue: 0
	}
}
