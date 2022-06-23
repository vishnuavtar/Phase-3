package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootTest
class SpringSecurityApplicationTests {


	
	@Test
	
	@RequestMapping("/admin")
	public String admin() {
		return "hi admins";
	}
	
	
	
	
}
