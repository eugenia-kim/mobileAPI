
<%@ page import="com.daily.dailyhotel.User" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'user.label', default: 'User')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-user" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-user" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list user">
			
				<g:if test="${userInstance?.facebook}">
				<li class="fieldcontain">
					<span id="facebook-label" class="property-label"><g:message code="user.facebook.label" default="Facebook" /></span>
					
						<span class="property-value" aria-labelledby="facebook-label"><g:link controller="facebook" action="show" id="${userInstance?.facebook?.id}">${userInstance?.facebook?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.email}">
				<li class="fieldcontain">
					<span id="email-label" class="property-label"><g:message code="user.email.label" default="Email" /></span>
					
						<span class="property-value" aria-labelledby="email-label"><g:fieldValue bean="${userInstance}" field="email"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.password}">
				<li class="fieldcontain">
					<span id="password-label" class="property-label"><g:message code="user.password.label" default="Password" /></span>
					
						<span class="property-value" aria-labelledby="password-label"><g:fieldValue bean="${userInstance}" field="password"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="user.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${userInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.phone}">
				<li class="fieldcontain">
					<span id="phone-label" class="property-label"><g:message code="user.phone.label" default="Phone" /></span>
					
						<span class="property-value" aria-labelledby="phone-label"><g:fieldValue bean="${userInstance}" field="phone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.bookingCount}">
				<li class="fieldcontain">
					<span id="bookingCount-label" class="property-label"><g:message code="user.bookingCount.label" default="Booking Count" /></span>
					
						<span class="property-value" aria-labelledby="bookingCount-label"><g:fieldValue bean="${userInstance}" field="bookingCount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.longitude}">
				<li class="fieldcontain">
					<span id="longitude-label" class="property-label"><g:message code="user.longitude.label" default="Longitude" /></span>
					
						<span class="property-value" aria-labelledby="longitude-label"><g:fieldValue bean="${userInstance}" field="longitude"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.latitude}">
				<li class="fieldcontain">
					<span id="latitude-label" class="property-label"><g:message code="user.latitude.label" default="Latitude" /></span>
					
						<span class="property-value" aria-labelledby="latitude-label"><g:fieldValue bean="${userInstance}" field="latitude"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.refferalCode}">
				<li class="fieldcontain">
					<span id="refferalCode-label" class="property-label"><g:message code="user.refferalCode.label" default="Refferal Code" /></span>
					
						<span class="property-value" aria-labelledby="refferalCode-label"><g:fieldValue bean="${userInstance}" field="refferalCode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.bookingses}">
				<li class="fieldcontain">
					<span id="bookingses-label" class="property-label"><g:message code="user.bookingses.label" default="Bookingses" /></span>
					
						<g:each in="${userInstance.bookingses}" var="b">
						<span class="property-value" aria-labelledby="bookingses-label"><g:link controller="bookings" action="show" id="${b.id}">${b?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.dateCreated}">
				<li class="fieldcontain">
					<span id="dateCreated-label" class="property-label"><g:message code="user.dateCreated.label" default="Date Created" /></span>
					
						<span class="property-value" aria-labelledby="dateCreated-label"><g:formatDate date="${userInstance?.dateCreated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.dateUpdated}">
				<li class="fieldcontain">
					<span id="dateUpdated-label" class="property-label"><g:message code="user.dateUpdated.label" default="Date Updated" /></span>
					
						<span class="property-value" aria-labelledby="dateUpdated-label"><g:formatDate date="${userInstance?.dateUpdated}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.failCount}">
				<li class="fieldcontain">
					<span id="failCount-label" class="property-label"><g:message code="user.failCount.label" default="Fail Count" /></span>
					
						<span class="property-value" aria-labelledby="failCount-label"><g:fieldValue bean="${userInstance}" field="failCount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.notifications}">
				<li class="fieldcontain">
					<span id="notifications-label" class="property-label"><g:message code="user.notifications.label" default="Notifications" /></span>
					
						<g:each in="${userInstance.notifications}" var="n">
						<span class="property-value" aria-labelledby="notifications-label"><g:link controller="notification" action="show" id="${n.id}">${n?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.pointAmount}">
				<li class="fieldcontain">
					<span id="pointAmount-label" class="property-label"><g:message code="user.pointAmount.label" default="Point Amount" /></span>
					
						<span class="property-value" aria-labelledby="pointAmount-label"><g:fieldValue bean="${userInstance}" field="pointAmount"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.pointGains}">
				<li class="fieldcontain">
					<span id="pointGains-label" class="property-label"><g:message code="user.pointGains.label" default="Point Gains" /></span>
					
						<g:each in="${userInstance.pointGains}" var="p">
						<span class="property-value" aria-labelledby="pointGains-label"><g:link controller="pointGain" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.pointPays}">
				<li class="fieldcontain">
					<span id="pointPays-label" class="property-label"><g:message code="user.pointPays.label" default="Point Pays" /></span>
					
						<g:each in="${userInstance.pointPays}" var="p">
						<span class="property-value" aria-labelledby="pointPays-label"><g:link controller="pointPay" action="show" id="${p.id}">${p?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.referralsForReferralUserId}">
				<li class="fieldcontain">
					<span id="referralsForReferralUserId-label" class="property-label"><g:message code="user.referralsForReferralUserId.label" default="Referrals For Referral User Id" /></span>
					
						<g:each in="${userInstance.referralsForReferralUserId}" var="r">
						<span class="property-value" aria-labelledby="referralsForReferralUserId-label"><g:link controller="referral" action="show" id="${r.id}">${r?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${userInstance?.userDevices}">
				<li class="fieldcontain">
					<span id="userDevices-label" class="property-label"><g:message code="user.userDevices.label" default="User Devices" /></span>
					
						<span class="property-value" aria-labelledby="userDevices-label"><g:link controller="userDevice" action="show" id="${userInstance?.userDevices?.id}">${userInstance?.userDevices?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:userInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${userInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
