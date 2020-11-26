package com.tr.springcloud.configserverremote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerRemoteApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerRemoteApplication.class, args);
	}

}
