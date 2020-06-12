package com.edu.lingnan.springcloud.controller;

import com.edu.lingnan.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 17:10 2020/6/7
 */
@RestController
public class DeprConsumerController {

    @Autowired
    public RestTemplate restTemplate;

    private static final String REST_URL_FREFIX = "http://SPRINGCLOUD-PROVIDE-DEPT";

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_FREFIX + "/dept/get/" + id, Dept.class);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_FREFIX + "/dept/list/", List.class);
    }

    @PostMapping("/comsumer/dept")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_FREFIX + "/dept/add", dept, boolean.class);
    }
}
