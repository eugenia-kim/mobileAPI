class UrlMappings {

	static mappings = {
		
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

		group "/app_version/v1", {
			"/"(controller:"AppVersion", action:[GET: "test"])
		}
		
		group "/user/v1", {
			"/sign_up"(controller:"User", parseRequest:true, action:[POST: "sign_up"])
		}
		
		group "/common/v1", {
			"/date"(controller:"Common", action:[GET: "date"])
		}
		
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
