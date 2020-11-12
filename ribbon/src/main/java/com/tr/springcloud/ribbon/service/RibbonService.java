package com.tr.springcloud.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author TR
 * @version 1.0
 * @date 2020/11/7 下午2:46
 */
@Service
public class RibbonService {

    @Resource
    RestTemplate restTemplate;

    /**
     * 1.在该类的get()方法用restTemplate 调用eureka-client 的API接口，Uri上不需要使用硬编码（比如IP），只需要写服务名eureka-client即可
     * 程序会根据服务名称eureka-client 到Eureka-server 注册中心去自动获取IP和端口信息。
     *
     * 2.为该方法配置Hystrix 熔断，在 服务不可用/处理抛出异常 时自动执行 fallback 逻辑，实现快速失败。
     */
    @HystrixCommand(fallbackMethod = "hystrixFallback") // 该注解可以配在Controller类方法上，效果相同
    public String get() {
//        int i = 1/0; // 制造异常也会触发熔断
        return restTemplate.getForObject("http://eureka-client/get", String.class);
    }

    public String hystrixFallback() {
        return "Ribbon Hystrix Fallback";
    }

}
