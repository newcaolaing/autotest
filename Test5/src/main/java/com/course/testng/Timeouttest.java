package com.course.testng;

import org.testng.annotations.Test;

public class Timeouttest {
    @Test(timeOut = 3000)
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test(timeOut = 3000)
    public void test3() throws InterruptedException {
        Thread.sleep(3001);
    }
}
