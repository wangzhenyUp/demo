package com.gradleexample.demo.service;

import com.gradleexample.demo.entity.Employees;


import java.util.List;

/**
 * @author  wzy
 */
public interface EmployeesService{
    /**
     * 查找所有employee信息
     * @return List<Employees>
     */
    List<Employees> getEmployeesInf();
    Employees getEmployeeById(int id);

    /**
     * 插入employee信息
     * @param  listEmployees Employees的集合对象
     * @return int 返回成功个数
     */
    int inputEmployeeInfo(List<Employees> listEmployees);
}
