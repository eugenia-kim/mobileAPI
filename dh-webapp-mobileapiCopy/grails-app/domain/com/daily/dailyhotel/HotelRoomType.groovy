package com.daily.dailyhotel

class HotelRoomType {

	String name
	Date dateCreated
	Date dateUpdated
	CodeLang codeLang

	static hasMany = [hotelRooms: HotelRoom]
	static belongsTo = [CodeLang]

	static mapping = {
		id sqlType: 'tinyint'
		codeLang column: 'code_lang_id', sqlType: 'smallint'
		version false
	}

	static constraints = {
		name maxSize: 45
	}
}
