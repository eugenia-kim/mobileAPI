package com.daily.dailyhotel

class User {

	String email
	String password
	String name
	String phone
	Double longitude
	Double latitude
	Integer pointAmount
	Integer bookingCount
	Byte failCount
	String refferalCode
	Date dateCreated
	Date dateUpdated
	Facebook facebook

	static hasMany = [bookingses: Bookings,
	                  notifications: Notification,
	                  pointGains: PointGain,
	                  pointPays: PointPay,
	                  referralsForReferralUserId: Referral]
	
	static hasOne = [userDevices: UserDevice]
	
	static belongsTo = [Facebook]

	static mappedBy = [referralsForReferralUserId: 'userByReferralUserId']
	
	static mapping = {
		facebook column: 'facebook_id'
		pointAmount sqlType: 'mideumint', defaultValue: 0
		bookingCount sqlType: 'mideumint', defaultValue: 0
		longitude defaultValue: null
		latitude defaultValue: null
		version false
	}

	static constraints = {
		facebook nullable: true
		email maxSize: 100
		password maxSize: 45
		name maxSize: 45
		phone maxSize: 20
		bookingCount defaultValue: 0
		longitude nullable: true
		latitude nullable: true
		refferalCode maxSize: 45
	}
}
