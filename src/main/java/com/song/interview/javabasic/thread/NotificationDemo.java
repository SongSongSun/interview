package com.song.interview.javabasic.thread;

/**
 * @Author Song
 * @Date 2021/8/11 9:30
 * @Version 1.0
 * @Description
 */
public class NotificationDemo {
    private volatile boolean go = false;

    public synchronized void shouldGo() {
        while (!go) {
            try {
                System.out.println(Thread.currentThread().getName() + " will wait");
                wait();
                System.out.println(Thread.currentThread().getName() + " is woken up");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        go = false;
    }

    public synchronized void go() {
        while (!go) {
            System.out.println(Thread.currentThread().getName() + " will notify one or more task");
            go = true;
            notifyAll();
        }
    }

    public static void main(String[] args) {
        final NotificationDemo test = new NotificationDemo();
        Runnable waitTask = new Runnable() {
            public void run() {
                try {
                    test.shouldGo();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " finished execution");
            }
        };

        Runnable notifyTask = new Runnable() {
            public void run() {
                try {
                    test.go();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + " finished execution");
            }
        };
        Thread waitTask1 = new Thread(waitTask, "waitTask1");
        Thread waitTask2 = new Thread(waitTask, "waitTask2");
        Thread waitTask3 = new Thread(waitTask, "waitTask3");
        waitTask1.start();
        waitTask2.start();
        waitTask3.start();

        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread task = new Thread(notifyTask, "notifyTask");
        task.start();
    }
}
