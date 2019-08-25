package com.course.testng;

import org.testng.annotations.Test;

public class Expectedexception {

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeexceptionfail(){
        System.out.println("error : tineout");
    }


    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeexceptionsuccess(){
        System.out.println("error2 : tineout");
        throw new RuntimeException();

    }
}
