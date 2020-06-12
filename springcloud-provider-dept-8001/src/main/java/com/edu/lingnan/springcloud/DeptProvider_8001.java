package com.edu.lingnan.springcloud;

import com.mysql.jdbc.MiniAdmin;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 16:57 2020/6/7
 */
@EnableEurekaClient
@SpringBootApplication
@EnableCircuitBreaker //开启熔断机制
public class DeptProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8001.class, args);
    }
}
