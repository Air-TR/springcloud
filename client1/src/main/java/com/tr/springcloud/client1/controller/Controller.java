package com.tr.springcloud.client1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TR
 * @version 1.0
 * @date 2020/11/6 上午1:23
 */
@RestController
public class Controller {

    @Value("${spring.application.name}")
    private String name;

    @Value("${server.port}")
    private String port;

    @GetMapping("/get")
    public String get() {
        return "response from " + name + "1, port: " + port;
    }

}
