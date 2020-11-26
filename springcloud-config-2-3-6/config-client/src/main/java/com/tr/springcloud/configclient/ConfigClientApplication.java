package com.tr.springcloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * config-client 项目是不区分本地和远程的，
 * 所以 config-server-local 和 config-server-remote 都可以用 config-client 项目测试
 *
 * @author TR
 * @date 2020/11/26 下午11:12
 */
@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}

	@Value("${name}")
	String name;

	@GetMapping(value = "/name")
	public String getName(){
		return name;
	}

}
