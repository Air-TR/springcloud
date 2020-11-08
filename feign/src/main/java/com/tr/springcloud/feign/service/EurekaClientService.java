package com.tr.springcloud.feign.service;

import com.tr.springcloud.feign.client.EurekaClientFeign;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author TR
 * @version 1.0
 * @date 2020/11/8 下午9:41
 */
@Service
public class EurekaClientService {

    @Resource
    EurekaClientFeign eurekaClientFeign;

    /**
     * EurekaClientService 类注入EurekaClientFeign 的Bean，通过EurekaClientFeign 去调用feignGetAPI() 方法
     */
    public String get(){
        return  eurekaClientFeign.feignGetAPI();
    }

}
