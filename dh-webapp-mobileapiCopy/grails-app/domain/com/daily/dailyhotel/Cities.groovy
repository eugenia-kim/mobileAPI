package com.daily.dailyhotel

class Cities {

	String name
	Short sequence
	String timezoneName
	String timzoneOffset
	Date dateCreated
	Date dateUpdated
	CodeTimezone codeTimezone
	Countries countries

	static hasMany = [regions: Region]
	static belongsTo = [CodeTimezone, Countries]

	static mapping = {
		id sqlType: "smallint"
		codeTimezone sqlType: "mediumint"
		countries column: 'countries_id', sqlType: "smallint"
		version false
	}

	static constraints = {
		name maxSize: 45
		sequence unique: true
		timezoneName maxSize: 45
		timzoneOffset maxSize: 45
	}
}
