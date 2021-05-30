package com.csp.concurrency.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/**
 * @description:
 * @author: csp52872
 * @date: 2021/05/30
 */
public class LookSupportApi {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("park");
            LockSupport.park();
            System.out.println("exit");
        });
        thread.start();
        TimeUnit.SECONDS.sleep(1);
        LockSupport.unpark(thread);
        System.out.println("unpark");

    }

}
