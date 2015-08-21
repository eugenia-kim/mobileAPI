package com.daily.dailyhotel

class Board {

	String title
	String contents
	String writer
	Date dateCreated
	Date dateUpdated

	static mapping = {
		version false
	}

	static constraints = {
		title maxSize: 45
		contents maxSize: 4000
		writer maxSize: 45
	}
}
