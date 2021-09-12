package com.song.interview.javabasic.DesignModel;

/**
 * @Author Song
 * @Date 2021/9/12 22:42
 * @Version 1.0
 * @Description
 */
public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        //添加第一个  if (instance == null) 为了防止A线程到达(标记点A)时,还没初始化对象,发生时间片轮转 B线程也能继续初始化对象
        if (instance == null) {
            //标记点A
            //为什么不直接在方法上添加synchronized   因为直接在方法上添加synchronized  在多次调用getInstance会影响性能
            synchronized (Singleton.class) {
                //添加第二个 if (instance == null) 为了防止当线程A到达(标记点B)时 发生时间片轮转,B线程开始调用getInstance 并且走完了整个过程,初始化了对象,当再轮到A时,A还会继续初始化对象
                if (instance == null) {
                    //标记点B
                    return new Singleton();
                }
            }
        }
        return instance;
    }
}
