package com.daily.dailyhotel

class Notification {

	String notificationId
	Date dateCreated
	Date dateUpdated
	User user
	CodeOsType codeOsType

	static belongsTo = [CodeOsType, User]

	static mapping = {
		codeOsType column: 'code_os_type_id', sqlType: 'tinyint'
		version false
	}

	static constraints = {
		notificationId maxSize: 4000
	}
}
