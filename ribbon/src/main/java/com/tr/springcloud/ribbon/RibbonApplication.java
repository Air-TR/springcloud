package com.tr.springcloud.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 该工程涉及:
 * 	1.Ribbon (RibbonConfig类)
 * 	2.Ribbon上使用Hystrix (RibbonService类)
 * 	3.@EnableHystrixDashboard 监控Hystrix 熔断器状况
 *
 * 	Hystrix避坑():
 * 		https://www.jianshu.com/p/0a682e4781b0  (Unable to connect to Command Metric Stream)
 * 		https://www.cnblogs.com/luas/p/12166607.html  (访问 /hystrix.stream 404)
 * 	注: 调试Hystrix监控组件前，先调用一下需要监控的服务地址，测试发现先有调用才会有预期的显示效果，
 * 		否则monitor页面一直是loading，hystrix.stream一直是ping，没有返回data
 *
 * @author TR
 * @date 2020/11/10 下午11:40
 */
@EnableEurekaClient
@EnableHystrix
@EnableHystrixDashboard
//@EnableCircuitBreaker // 不引入发现效果无影响，@EnableHystrix继承了@EnableCircuitBreaker
@SpringBootApplication
public class RibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}

}
