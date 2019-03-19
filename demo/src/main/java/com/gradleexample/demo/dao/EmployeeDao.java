package com.gradleexample.demo.dao;

import com.gradleexample.demo.entity.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author  wzy
 */
@Mapper
public interface EmployeeDao {
    /**
     * 查找employee表中所有的信息
     */
    @Select("SELECT name,sex,workno from employee")
    List<Employees> selectAllEmployees();
}
