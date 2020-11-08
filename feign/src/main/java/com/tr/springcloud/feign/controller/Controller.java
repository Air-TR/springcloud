package com.tr.springcloud.feign.controller;

import com.tr.springcloud.feign.service.EurekaClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author TR
 * @version 1.0
 * @date 2020/11/8 下午9:38
 */
@RestController
public class Controller {

    @Resource
    EurekaClientService eurekaClientService;

    /**
     * 通过Feign配置访问 eureka-client 的API的接口
     * @return
     */
    @GetMapping("/eureka-client/get")
    public String client1Get(){
        return eurekaClientService.get();
    }

}
