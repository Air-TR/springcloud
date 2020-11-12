package com.tr.springcloud.feign.client;

import com.tr.springcloud.feign.client.config.FeignConfig;
import com.tr.springcloud.feign.client.hystrix.EurekaClientHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 1.实现Feign: 在接口上加＠FeignClient 注解声明一个Feign Client，其中value 为远程调用其他服务的服务名
 *
 * 2.实现Hystrix: 在@FeignClien 中加入configuration 和fallback 配置
 *
 * @author TR
 * @date 2020/11/8 下午9:43
 */
@FeignClient(value = "eureka-client", configuration = FeignConfig.class, fallback = EurekaClientHystrix.class)
public interface EurekaClientFeign {

    /**
     * 该方法通过Feign 调用eureka-client 服务的 "/get" 的API接口
     * @return
     */
    @GetMapping("/get")
    String get();

}
