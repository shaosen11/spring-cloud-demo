package com.edu.lingnan.springcloud.controller;

import com.edu.lingnan.springcloud.pojo.Dept;
import com.edu.lingnan.springcloud.service.DeptFeignService;
import com.edu.lingnan.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 15:11 2020/6/7
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    @HystrixCommand(fallbackMethod = "fallback")
    public Dept get(@PathVariable("id") Long id) {
        Dept dept = deptService.queryById(id);
        if (dept == null) {
            throw new RuntimeException("没有数据库记录");
        }
        return dept;
    }

    @GetMapping("/dept/list")
    public List<Dept> queryAll() {
        return deptService.queryAll();
    }

    public Dept fallback(@PathVariable("id") Long id) {
        return new Dept().setDeptno(id).setDname("没有名称").setDb_source("没有数据库");
    }
}
