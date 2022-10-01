package io.javabrains.springbootstarter.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi , Going Good on Learning, I am starting this new course, on Java Spring Boot for Hacktoberfest, will be logging my progress here";
	}

	@RequestMapping("/status")
	public String statusUpdate() {
		return "Learned about GET POST DELETE AND PUT Methods";
	}
	

}
