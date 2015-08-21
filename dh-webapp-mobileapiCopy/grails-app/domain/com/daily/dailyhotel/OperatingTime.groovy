package com.daily.dailyhotel

class OperatingTime {

	Date openingTime
	Date closingTime
	Date dateCreated
	Date dateUpdated

	static mapping = {
		id sqlType: 'smallint'
		openingTime sqlType: 'time'
		closingTime sqlType: 'time'
		version false
	}
}
