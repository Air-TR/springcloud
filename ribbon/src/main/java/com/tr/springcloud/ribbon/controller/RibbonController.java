package com.tr.springcloud.ribbon.controller;

import com.tr.springcloud.ribbon.service.RibbonService;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author TR
 * @version 1.0
 * @date 2020/11/7 下午2:37
 */
@RestController
public class RibbonController {

    @Resource
    private RibbonService ribbonService;

    @GetMapping("/get")
    public String get() {
        return ribbonService.get();
    }

    /**
     * 负载均衡器的核心类：LoadBalancerClient，可以获取负载均衡的服务提供者的实例信息
     */
    @Resource
    private LoadBalancerClient loadBalancerClient;

    /**
     * 通过LoadBalancerClient 去选择一个eureka-client 的服务实例的信息，并将该信息返回
     */
    @GetMapping("/service-instance")
    public String serviceInstance() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        return serviceInstance.getHost() + ":" + serviceInstance.getPort();
    }

}
