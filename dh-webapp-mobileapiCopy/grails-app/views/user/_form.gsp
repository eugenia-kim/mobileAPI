<%@ page import="com.daily.dailyhotel.User" %>



<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'facebook', 'error')} ">
	<label for="facebook">
		<g:message code="user.facebook.label" default="Facebook" />
		
	</label>
	<g:select id="facebook" name="facebook.id" from="${com.daily.dailyhotel.Facebook.list()}" optionKey="id" value="${userInstance?.facebook?.id}" class="many-to-one" noSelection="['null': '']"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'email', 'error')} required">
	<label for="email">
		<g:message code="user.email.label" default="Email" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="email" maxlength="100" required="" value="${userInstance?.email}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="user.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="password" maxlength="45" required="" value="${userInstance?.password}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="user.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="45" required="" value="${userInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'phone', 'error')} required">
	<label for="phone">
		<g:message code="user.phone.label" default="Phone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="phone" maxlength="20" required="" value="${userInstance?.phone}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'bookingCount', 'error')} required">
	<label for="bookingCount">
		<g:message code="user.bookingCount.label" default="Booking Count" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="bookingCount" type="number" value="${userInstance.bookingCount}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'longitude', 'error')} ">
	<label for="longitude">
		<g:message code="user.longitude.label" default="Longitude" />
		
	</label>
	<g:field name="longitude" value="${fieldValue(bean: userInstance, field: 'longitude')}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'latitude', 'error')} ">
	<label for="latitude">
		<g:message code="user.latitude.label" default="Latitude" />
		
	</label>
	<g:field name="latitude" value="${fieldValue(bean: userInstance, field: 'latitude')}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'refferalCode', 'error')} required">
	<label for="refferalCode">
		<g:message code="user.refferalCode.label" default="Refferal Code" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="refferalCode" maxlength="45" required="" value="${userInstance?.refferalCode}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'bookingses', 'error')} ">
	<label for="bookingses">
		<g:message code="user.bookingses.label" default="Bookingses" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${userInstance?.bookingses?}" var="b">
    <li><g:link controller="bookings" action="show" id="${b.id}">${b?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="bookings" action="create" params="['user.id': userInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'bookings.label', default: 'Bookings')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'dateUpdated', 'error')} required">
	<label for="dateUpdated">
		<g:message code="user.dateUpdated.label" default="Date Updated" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateUpdated" precision="day"  value="${userInstance?.dateUpdated}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'failCount', 'error')} required">
	<label for="failCount">
		<g:message code="user.failCount.label" default="Fail Count" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="failCount" type="number" value="${userInstance.failCount}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'notifications', 'error')} ">
	<label for="notifications">
		<g:message code="user.notifications.label" default="Notifications" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${userInstance?.notifications?}" var="n">
    <li><g:link controller="notification" action="show" id="${n.id}">${n?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="notification" action="create" params="['user.id': userInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'notification.label', default: 'Notification')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'pointAmount', 'error')} required">
	<label for="pointAmount">
		<g:message code="user.pointAmount.label" default="Point Amount" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="pointAmount" type="number" value="${userInstance.pointAmount}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'pointGains', 'error')} ">
	<label for="pointGains">
		<g:message code="user.pointGains.label" default="Point Gains" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${userInstance?.pointGains?}" var="p">
    <li><g:link controller="pointGain" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="pointGain" action="create" params="['user.id': userInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'pointGain.label', default: 'PointGain')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'pointPays', 'error')} ">
	<label for="pointPays">
		<g:message code="user.pointPays.label" default="Point Pays" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${userInstance?.pointPays?}" var="p">
    <li><g:link controller="pointPay" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="pointPay" action="create" params="['user.id': userInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'pointPay.label', default: 'PointPay')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'referralsForReferralUserId', 'error')} ">
	<label for="referralsForReferralUserId">
		<g:message code="user.referralsForReferralUserId.label" default="Referrals For Referral User Id" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${userInstance?.referralsForReferralUserId?}" var="r">
    <li><g:link controller="referral" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="referral" action="create" params="['user.id': userInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'referral.label', default: 'Referral')])}</g:link>
</li>
</ul>


</div>

<div class="fieldcontain ${hasErrors(bean: userInstance, field: 'userDevices', 'error')} required">
	<label for="userDevices">
		<g:message code="user.userDevices.label" default="User Devices" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="userDevices" name="userDevices.id" from="${com.daily.dailyhotel.UserDevice.list()}" optionKey="id" required="" value="${userInstance?.userDevices?.id}" class="many-to-one"/>

</div>

