package com.gradleexample.demo.mapper;

import com.gradleexample.demo.entity.Employees;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class EmployeeMapperTest {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Test
    public void selectAllTest(){
        List<Employees> empList =  employeeMapper.selectAllEmployees();
        for (Employees e: empList) {
            System.out.println(e);
        }
    }
}
