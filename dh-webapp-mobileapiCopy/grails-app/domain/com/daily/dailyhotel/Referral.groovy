package com.daily.dailyhotel

class Referral {

	User userById
	Character referralUserBooking
	Date dateCreated
	Date dateUpdated
	User userByReferralUserId

	static belongsTo = [User]

	static mapping = {
		id column: "user_id"
		userById column: 'user_id', updateable: false, insertable: false
		referralUserBooking column: 'referral_user_booking'
		userByReferralUserId column: 'referral_user_id'
		version false
	}

	static constraints = {
		userById unique: true
		referralUserBooking maxSize: 1
	}
}
