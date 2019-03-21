package com.gradleexample.demo.service;

import com.gradleexample.demo.mapper.EmployeeMapper;
import com.gradleexample.demo.entity.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

/**
 * @author  wzy
 */
@Service
public class EmployeesServiceImpl implements EmployeesService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employees> getEmployeesInf() {
        return employeeMapper.selectAllEmployees();
    }

    @Override
    /** 通过 id 查找员工信息*/
    public Employees getEmployeeById(int id) {

            return employeeMapper.selectEmployeeById(id);
    }

    /**
     * 增加员工信息
     * @param  listEmployees List<Employees>对象
     * @return 成功信息
     */
    @Override
    public int inputEmployeeInfo(List<Employees> listEmployees) {
        int result = 0;
        for (Employees employee : listEmployees) {
            employeeMapper.insertEmployee(employee);
            result++;
        }

        return result;
    }
}
