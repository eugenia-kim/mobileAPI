package com.daily.dailyhotel

class PointGain {

	Integer amount
	Date dateExpiry
	Date dateCreated
	Date dateUpdated
	User user
	Promotion promotion
	PointMessage pointMessage

	static belongsTo = [PointMessage, Promotion, User]

	static mapping = {
		promotion column: 'promotion_id'
		pointMessage column: 'point_message_id', sqlType: 'smallint'
		amount sqlType: 'mediumint'
		version false
	}
	
	static constraints = {
		promotion nullable: true
	}
}
