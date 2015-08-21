package com.daily.dailyhotel

class PointPay {

	Integer amount
	Date dateCreated
	Date dateUpdated
	User user
	PointMessage pointMessage

	static belongsTo = [PointMessage, User]

	static mapping = {
		pointMessage column: 'point_message_id', sqlType: 'smallint'
		amount sqlType: 'mediumint'
		version false
	}
}
