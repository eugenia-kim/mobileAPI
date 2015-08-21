package com.daily.dailyhotel

class Region {

	Date dateCreated
	Date dateUpdated
	CodeLang codeLang
	Cities cities

	static hasMany = [hotels: Hotel,
	                  sales: Sale]
	static belongsTo = [Cities, CodeLang]

	static mapping = {
		codeLang column: 'code_lang_id', sqlType: 'smallint'
		cities column: 'cities_id', sqlType: 'smallint'
		version false
	}
}
