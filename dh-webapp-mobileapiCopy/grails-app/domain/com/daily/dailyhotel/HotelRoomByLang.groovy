package com.daily.dailyhotel

import org.apache.commons.lang.builder.EqualsBuilder
import org.apache.commons.lang.builder.HashCodeBuilder

class HotelRoomByLang implements Serializable {

	Long hotelRoomId
	Short codeLangId
	String name
	String comment
	Date dateCreated
	Date dateUpdated
	HotelRoom hotelRoom
	CodeLang codeLang

	int hashCode() {
		def builder = new HashCodeBuilder()
		builder.append hotelRoomId
		builder.append codeLangId
		builder.toHashCode()
	}

	boolean equals(other) {
		if (other == null) return false
		def builder = new EqualsBuilder()
		builder.append hotelRoomId, other.hotelRoomId
		builder.append codeLangId, other.codeLangId
		builder.isEquals()
	}

	static belongsTo = [CodeLang, HotelRoom]

	static mapping = {
		id composite: ["hotelRoomId", "codeLangId"]
		hotelRoomId column: "hotel_room_id", updateable: false, insertable: false
		codeLangId column: "code_lang_id", updateable: false, insertable: false
		hotelRoom column: "hotel_room_id", updateable: false, insertable: false
		codeLang column: "code_lang_id", updateable: false, insertable: false
		version false
	}

	static constraints = {
		name maxSize: 45
		comment maxSize: 45
	}
}
