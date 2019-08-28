package com.course.testng.muthread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

//    三个线程同时运行，一共运行10次
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }

}
