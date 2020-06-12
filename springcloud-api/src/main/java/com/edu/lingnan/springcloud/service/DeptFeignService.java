package com.edu.lingnan.springcloud.service;

import com.edu.lingnan.springcloud.pojo.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 15:11 2020/6/7
 */
@Component
@FeignClient(value = "springcloud-provide-dept")
public interface DeptFeignService {
    @PostMapping("/dept/add")
    boolean addDept(Dept dept);

    @GetMapping("/dept/get/{id}")
    Dept queryById(@PathVariable("id") Long id);

    @GetMapping("/dept/list")
    List<Dept> queryAll();
}
