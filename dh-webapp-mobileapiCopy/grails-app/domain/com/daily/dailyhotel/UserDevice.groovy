package com.daily.dailyhotel

class UserDevice {

	String osVersion
	String modelName
	String uuid
	Date dateCreated
	Date dateUpdated
	User user
	CodeOsType codeOsType
	CodeLang codeLang

	static belongsTo = [CodeLang, CodeOsType, User]

	static mapping = {
		codeOsType column: 'code_os_type_id', sqlType: 'tinyint'
		codeLang column: 'code_lang_id', sqlType: 'smallint'
		version false
	}

	static constraints = {
		osVersion nullable: true, maxSize: 10
		modelName nullable: true, maxSize: 45
		uuid nullable: true, maxSize: 60
	}
}
