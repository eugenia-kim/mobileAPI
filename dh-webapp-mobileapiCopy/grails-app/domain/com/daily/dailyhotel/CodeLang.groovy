package com.daily.dailyhotel

class CodeLang {

	String name
	Date dateCreated
	Date dateUpdated

	static hasMany = [hotelByLangs: HotelByLang,
	                  hotelGrades: HotelGrade,
	                  hotelRoomByLangs: HotelRoomByLang,
	                  hotelRoomTypes: HotelRoomType,
	                  pointMessages: PointMessage,
	                  regions: Region,
	                  userDevices: UserDevice]

	static mapping = {
		id sqlType: "smallint"
		version false
	}

	static constraints = {
		name maxSize: 2
	}
}
