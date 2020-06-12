package com.edu.lingnan.springcloud.controller;

import com.edu.lingnan.springcloud.pojo.Dept;
import com.edu.lingnan.springcloud.service.DeptFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 15:20 2020/6/8
 */
@RestController
public class DeprFeignConsumerController {

    @Autowired
    private DeptFeignService deptFeignService;


    @GetMapping("/fegin/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptFeignService.queryById(id);
    }

    @GetMapping("/fegin/dept/list")
    public List<Dept> list(){
        return deptFeignService.queryAll();
    }

    @PostMapping("/fegin/dept/add")
    public boolean add(Dept dept){
        return deptFeignService.addDept(dept);
    }
}
