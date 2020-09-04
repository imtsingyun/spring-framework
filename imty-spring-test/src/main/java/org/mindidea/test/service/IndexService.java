package org.mindidea.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexService {

//	@Autowired
//	private UserService userService;

	public IndexService() {
		System.out.println("constructor from IndexService");
	}

//	public void getUserService() {
//		System.out.println(userService);
//	}
}
