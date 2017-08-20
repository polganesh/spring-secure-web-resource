package com.gp;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	static Map<String, UserModel> userNameModelMap = new HashMap<String, UserModel>();
	static {
		userNameModelMap.put("gpol", new UserModel("gpol", "ganesh", "pol"));
		userNameModelMap.put("sthorat", new UserModel("sthorat", "sagar", "thorat"));
	}

	@RequestMapping("/allusers")
	public Collection<UserModel> geAllUsers() {
		return userNameModelMap.values();
	}
}
