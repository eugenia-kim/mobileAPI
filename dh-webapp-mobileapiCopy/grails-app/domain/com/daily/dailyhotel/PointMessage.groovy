package com.daily.dailyhotel

class PointMessage {

	String content
	Date dateCreated
	Date dateUpdated
	CodeLang codeLang

	static hasMany = [pointGains: PointGain,
	                  pointPays: PointPay]
	static belongsTo = [CodeLang]

	static mapping = {
		id sqlType: 'smallint'
		codeLang column: 'code_lang_id', sqlType: 'smallint'
		version false
	}

	static constraints = {
		content maxSize: 1000
	}
}
