package com.gradleexample.demo.action;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeController {
    @InjectMocks
    private EmployeeController employeeController;
//    @Mock
//
//    @Test
//    public void getStudentList() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("do/insertEmp"))
//                .andExpect(MockMvcResultMatchers.status().isOk());
//        //.andExpect(MockMvcResultMatchers.content().string("365"));  //测试接口返回内容
//    }
}
