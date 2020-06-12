package com.edu.lingnan.springcloud.service;

import com.edu.lingnan.springcloud.pojo.Dept;

import java.util.List;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 15:11 2020/6/7
 */
public interface DeptService {
    boolean addDept(Dept dept);

    Dept queryById(Long id);

    List<Dept> queryAll();
}
