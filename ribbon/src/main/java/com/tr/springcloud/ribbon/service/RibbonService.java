package com.tr.springcloud.ribbon.service;

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
     * 在该类的get()方法用restTemplate 调用eureka-client 的API接口，Uri上不需要使用硬编码（比如IP），只需要写服务名eureka-client即可
     * 程序会根据服务名称eureka-client 到Eureka-server 注册中心去自动获取IP和端口信息。
     */
    public String get() {
        return restTemplate.getForObject("http://eureka-client/get", String.class);
    }

}
