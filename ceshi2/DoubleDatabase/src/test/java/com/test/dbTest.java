package com.test;

import com.test.Bean.Emp;
import com.test.Bean2.man;
import com.test.dao.EmpMapper;
import com.test.dao2.ManMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class dbTest {

    @Autowired
    EmpMapper empMapper;

    @Autowired
    ManMapper manMapper;

    @Test
    public void getEmp(){
        List<Emp> emps = empMapper.queryAll();
        List<man> men = manMapper.queryAll();
        System.out.println(emps.toString());
        System.out.println(men.toString());
    }
}
