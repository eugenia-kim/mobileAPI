package com.daily.dailyhotel

class UserFindpw {

	String userEmail
	String authKey
	Character isChanged
	Date dateExpiry
	Date dateCreated
	Date dateUpdated

	static mapping = {
		version false
	}

	static constraints = {
		userEmail maxSize: 100
		authKey maxSize: 45
		isChanged maxSize: 1
	}
}
