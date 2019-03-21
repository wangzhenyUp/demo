package com.gradleexample.demo.action;

import com.gradleexample.demo.entity.Employees;
import com.gradleexample.demo.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


/**
 * @author  wzy
 */
@RestController
@RequestMapping("/do")
public class EmployeeController {
    @Autowired
    private EmployeesService employeesService;

    @RequestMapping("/emps")
    public List<Employees> getEmployees(){
        return employeesService.getEmployeesInf();
    }
    @RequestMapping("/emp")
    public Employees getEmployeeInfoById(int id){
        return  employeesService.getEmployeeById(id);
    }

    /**
     *插入员工信息
     * @param employeesList
     * @return int
     */
    @RequestMapping("/insertEmp")
    public int getInputResult(@RequestBody List<Employees> employeesList){
        int res = employeesService.inputEmployeeInfo(employeesList);
        return res;
    }
}
