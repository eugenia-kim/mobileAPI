package com.daily.dailyhotel

class Hotel {

	Float commission
	String imgDir
	BigDecimal longitude
	BigDecimal latitude
	String email
	String fax1
	String fax2
	Date dateCreated
	Date dateUpdated
	Voucher voucher
	Region region
	HotelGrade hotelGrade

	static hasMany = [hotelByLangs: HotelByLang,
	                  hotelRooms: HotelRoom]
	static belongsTo = [HotelGrade, Region, Voucher]

	static mapping = {
		hotelGrade column: 'hotel_grade_id', sqlType: 'tinyint'
		voucher column: 'voucher_id', sqlType: 'tinyint'
		version false
	}

	static constraints = {
		imgDir maxSize: 45
		longitude scale: 8
		latitude scale: 8
		email nullable: true, maxSize: 45
		fax1 nullable: true, maxSize: 45
		fax2 nullable: true, maxSize: 45
	}
}
