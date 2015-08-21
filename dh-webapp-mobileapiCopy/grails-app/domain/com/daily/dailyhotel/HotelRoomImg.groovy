package com.daily.dailyhotel

class HotelRoomImg {

	String dirName
	String imgMainName
	String imgNames

	static mapping = {
		version false
	}

	static constraints = {
		dirName nullable: true, maxSize: 45
		imgMainName nullable: true, maxSize: 50
		imgNames nullable: true, maxSize: 500
	}
}
