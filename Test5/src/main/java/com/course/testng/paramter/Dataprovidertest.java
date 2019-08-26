package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class Dataprovidertest {
    @Test(dataProvider = "data")
    public void tetsDate(String name, int age){
        System.out.println(name+":"+age);
    }

    @DataProvider(name = "data")
    public Object[][] Data(){
        Object [][] o = new Object[][]{
                {"1",1},{"2",2},{"3",3}
        };
  return o;


}

    @Test(dataProvider = "data2")
    public void tetsDate2(String name, int age){
        System.out.println(name+":"+age);
    }

    @DataProvider(name = "data2")
    public Object[][] Data2(Method method){
        Object[] [] o =null;
        if (method.getName().equals("tetsDate2")){
        o = new Object[][]{
                {"1",1},{"2",2},{"3",3}
        };}
        return o;


    }



}
