package com.daily.dailyhotel

class Promotion {

	String code
	Short countLimit
	Integer amount
	Byte expiryMonth
	Byte expiryDay
	Date dateStart
	Date dateEnd
	Date dateCreated
	Date dateUpdated

	static hasMany = [pointGains: PointGain]

	static mapping = {
		expiryDay sqlType: 'tinyInt'
		expiryMonth sqlType: 'tinyInt'
		amount sqlType: 'mediumint'
		version false
	}

	static constraints = {
		code maxSize: 45
		countLimit defaultValue: 0
		amount defaultValue: 0
		expiryMonth nullable: true
		expiryDay nullable: true
	}
}
