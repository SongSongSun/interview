package com.song.interview.javabasic.thread;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author Song
 * @Date 2021/8/11 17:32
 * @Version 1.0
 * @Description
 */
public class ReentrantLockDemo implements Runnable{
    private static ReentrantLock lock = new ReentrantLock(true);

    public void run() {
        
    }
}
