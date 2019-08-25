package com.course.testng.groups;


import org.testng.annotations.Test;

@Test(groups = "stu")
public class Groupsonclass2 {

    public void stu11(){
        System.out.println("class1 stu11 run!!!");
    }

    public void stu22(){
        System.out.println("class1 stu22 run!!!");
    }
}
