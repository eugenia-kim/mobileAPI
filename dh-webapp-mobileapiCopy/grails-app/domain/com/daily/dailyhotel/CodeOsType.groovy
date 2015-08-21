package com.daily.dailyhotel

class CodeOsType {

	String osType
	Date dateCreated
	Date dateUpdated

	static hasMany = [notifications: Notification,
	                  userDevices: UserDevice]

	static mapping = {
		id sqlType: 'tinyint'
		version false
	}

	static constraints = {
		osType maxSize: 10
	}
}
