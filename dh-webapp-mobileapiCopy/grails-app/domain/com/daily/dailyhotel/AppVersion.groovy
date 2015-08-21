package com.daily.dailyhotel

class AppVersion {

	String iosMin
	String iosMax
	Character iosUpdateForced
	String androidMin
	String androidMax
	Character androidUpdateForced
	Date dateCreated
	Date dateUpdated

	static mapping = {
		id sqlType: "smallint"
		version false
	}

	static constraints = {
		iosMin maxSize: 10
		iosMax maxSize: 10
		iosUpdateForced maxSize: 1
		androidMin maxSize: 10
		androidMax maxSize: 10
		androidUpdateForced maxSize: 1
	}
}
