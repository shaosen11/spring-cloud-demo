package com.edu.lingnan.springcloud.service.impl;

import com.edu.lingnan.springcloud.dao.DeptDao;
import com.edu.lingnan.springcloud.pojo.Dept;
import com.edu.lingnan.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 15:12 2020/6/7
 */
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;

    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }
    public Dept queryById(Long id) {
        return deptDao.queryById(id);
    }

    public List<Dept> queryAll() {
        return deptDao.queryAll();
    }
}
