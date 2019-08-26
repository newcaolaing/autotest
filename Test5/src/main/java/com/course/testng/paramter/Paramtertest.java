package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paramtertest {
    @Test
    @Parameters({"name","age"})
    public void paramtest(String name ,int age){
    System.out.println(name + ":" + age);

}}
