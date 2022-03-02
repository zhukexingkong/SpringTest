package com.learn.spring;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = FirstSpringApplication.class)
public class JUnit4Test {

    @Test
    public void firstTest() {
        System.out.println("JUnit4Test");
    }
}
