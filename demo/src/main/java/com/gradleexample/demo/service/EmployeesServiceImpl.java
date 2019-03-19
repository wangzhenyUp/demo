package com.gradleexample.demo.service;

import com.gradleexample.demo.dao.EmployeeDao;
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
    private EmployeeDao employeeDao;
    @Override
    public List<Employees> getEmployeesInf() {
        return employeeDao.selectAllEmployees();
    }
}
