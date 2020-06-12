package com.edu.lingnan.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 15:12 2020/6/9
 */
@EnableDiscoveryClient
@EnableHystrixDashboard
@SpringBootApplication
public class HystrixDashBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDashBoardApplication.class, args);
    }
}
