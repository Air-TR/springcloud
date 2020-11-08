package com.tr.springcloud.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author TR
 * @version 1.0
 * @date 2020/11/7 下午2:43
 */
@Configuration
public class RibbonConfig {

    /**
     * 在此类中为IoC 容器中注入一个RestTemplate 的Bean，并在这个Bean 上加上@LoadBalanced 注解，此时RestTemplate 就结合了
     * Ribbon 开启了负载均衡功能。
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
