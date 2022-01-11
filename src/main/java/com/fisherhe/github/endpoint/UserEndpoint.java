package com.fisherhe.github.endpoint;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * com.fisherhe.github.endpoint
 *
 * @author Fisher.He
 */

@Controller
public class UserEndpoint {

	@GetMapping("/api/users")
	public Map<String, String> getUsers() {
		Map<String, String> users = new HashMap<>(2);
		users.put("name", "John");
		users.put("email", "john@gmail.com");
		return users;
	}
}
