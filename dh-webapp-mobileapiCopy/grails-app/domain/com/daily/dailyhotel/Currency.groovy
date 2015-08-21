package com.daily.dailyhotel

class Currency {

	String name
	String symbol
	String isoCode
	String isoNumber
	BigDecimal rate
	Character isPrefix
	Byte roundOffset
	Date dateCreated
	Date dateUpdated

	static mapping = {
		id sqlType: 'int'
		version false
	}

	static constraints = {
		name nullable: true, maxSize: 45
		symbol nullable: true, maxSize: 45
		isoCode nullable: true, maxSize: 45
		isoNumber nullable: true, maxSize: 45
		rate nullable: true
		isPrefix maxSize: 1
	}
}
