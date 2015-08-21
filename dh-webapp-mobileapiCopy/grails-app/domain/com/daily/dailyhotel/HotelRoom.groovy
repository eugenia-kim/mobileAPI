package com.daily.dailyhotel

class HotelRoom {

	Integer fixedPrice
	Date checkIn
	Date checkOut
	String imgDir
	Date dateCreated
	Date dateUpdated
	HotelRoomType hotelRoomType
	Hotel hotel

	static hasMany = [hotelRoomByLangs: HotelRoomByLang]
	
	static hasOne = [sales: Sale]
	
	static belongsTo = [Hotel, HotelRoomType]

	static mapping = {
		fixedPrice sqlType: 'mediumint'
		checkIn sqlType: 'time'
		checkOut sqlType: 'time'
		hotelRoomType column: 'hotel_room_type_id', sqlType: 'tinyint'
		version false
	}

	static constraints = {
		imgDir maxSize: 45
	}
}
