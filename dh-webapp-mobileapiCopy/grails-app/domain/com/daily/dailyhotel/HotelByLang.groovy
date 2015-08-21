package com.daily.dailyhotel

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class HotelByLang implements Serializable {

	Long hotelId
	Short codeLangId
	String name
	String address
	String addressSimplified
	String comment
	Date dateCreated
	Date dateUpdated
	CodeLang codeLang
	Hotel hotel

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append hotelId
		builder.append codeLangId
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append hotelId, other.hotelId
		builder.append codeLangId, other.codeLangId
		builder.isEquals()
	}

	static belongsTo = [CodeLang, Hotel]

	static mapping = {
		id composite: ["hotelId", "codeLangId"]
		hotelId column: 'hotel_id', updateable: false, insertable: false
		codeLangId column: 'code_lang_id', updateable: false, insertable: false
		hotel column: 'hotel_id', updateable: false, insertable: false
		codeLang column: 'code_lang_id', updateable: false, insertable: false
		version false
	}

	static constraints = {
		name maxSize: 45
		address maxSize: 45
		addressSimplified maxSize: 45
		comment maxSize: 200
	}
}
