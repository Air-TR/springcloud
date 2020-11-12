package com.tr.springcloud.feign.client.hystrix;

import com.tr.springcloud.feign.client.EurekaClientFeign;
import org.springframework.stereotype.Component;

/**
 * @author TR
 * @version 1.0
 * @date 2020/11/11 下午11:13
 */
@Component
public class EurekaClientHystrix implements EurekaClientFeign {

    @Override
    public String get() {
        return "Feign Hystrix Fallback";
    }

}
