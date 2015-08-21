package com.daily.dailyhotel

class HotelGrade {

	String name
	Date dateCreated
	Date dateUpdated
	CodeLang codeLang

	static hasMany = [hotels: Hotel]
	static belongsTo = [CodeLang]

	static mapping = {
		id sqlType: 'tinyint'
		codeLang column: 'code_language_id', sqlType: 'smallint'
		version false
	}

	static constraints = {
		name maxSize: 45
	}
}
