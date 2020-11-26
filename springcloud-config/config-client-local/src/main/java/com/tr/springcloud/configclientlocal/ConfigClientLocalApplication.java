package com.tr.springcloud.configclientlocal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientLocalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientLocalApplication.class, args);
	}

//	@Value("${foo}")
//	String foo;
	@GetMapping(value = "/foo")
	public String foo(){
		return "foo";
	}

}
