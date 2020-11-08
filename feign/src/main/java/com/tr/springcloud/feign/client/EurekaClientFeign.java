package com.tr.springcloud.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 在接口上加＠FeignClient 注解声明一个Feign Client，其中value 为远程调用其他服务的服务名
 *
 * @author TR
 * @date 2020/11/8 下午9:43
 */
@FeignClient("eureka-client")
public interface EurekaClientFeign {

    /**
     * 该方法通过Feign 调用eureka-client 服务的 "/get" 的API接口
     * @return
     */
    @GetMapping("/get")
    String feignGetAPI();

}
