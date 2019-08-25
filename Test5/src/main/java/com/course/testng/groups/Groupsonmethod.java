package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groupsonmethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("test1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("test2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("test3");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("test4");
    }

    @BeforeGroups("server")
    public void beforegroup(){
        System.out.println("beforeserver");
    }

    @AfterGroups("server")
    public void aftergroup(){
        System.out.println("aftergroup");
    }
}
