package com.tr.springcloud.client2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author TR
 * @version 1.0
 * @date 2020/11/7 下午1:58
 */
@RestController
public class Controller {

    @Value("${spring.application.name}")
    private String name;

    @Value("${server.port}")
    private String port;

    @GetMapping("/get")
    public String get() {
        return "response from " + name + "2, port: " + port;
    }

}
