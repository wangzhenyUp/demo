package com.gradleexample.demo.action;

import com.gradleexample.demo.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * @author  wzy
 */
@Controller
@RequestMapping("/")
public class EmployeeController {
    @Autowired
    private EmployeesService employeesService;
    @RequestMapping("/")
    public ModelAndView getEmployees(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("employeesList", employeesService.getEmployeesInf());
        mv.setViewName("showEmployee.ftl");

        return mv;
    }
}
