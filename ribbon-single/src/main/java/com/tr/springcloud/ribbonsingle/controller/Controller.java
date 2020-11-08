package com.tr.springcloud.ribbonsingle.controller;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author TR
 * @version 1.0
 * @date 2020/11/7 下午3:34
 */
@RestController
public class Controller {

    @Resource
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/service-instance")
    public String serviceInstance() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("stores");
        return serviceInstance.getHost() + ":" + serviceInstance.getPort();
    }

}
