package com.edu.lingnan.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @Author shaosen
 * @Description //TODO
 * @Date 14:55 2020/6/7
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Dept {
    private Long deptno;
    private String dname;
    private String db_source;

    public Dept(String dname){
        this.dname = dname;
    }
}
