package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("test1");
    }

    @Test
    public void testCase2(){
        System.out.println("test2");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("BeforeMethod");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("aftermethod");
    }

    @BeforeClass
    public void beforeclass(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("AfterClass");
    }

    @BeforeSuite
    public void beforesuite(){
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void aftersuite(){
        System.out.println("AfterSuite");
    }
}
