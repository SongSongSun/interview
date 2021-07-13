package com.song.interview.javabasic.reflect;

import java.io.*;

/**
 * @Author Song
 * @Date 2021/7/13 16:39
 * @Version 1.0
 * @Description
 */
public class MyClassLoader extends ClassLoader {
    private String path;
    private String classLoaderName;

    public MyClassLoader(String path, String classLoaderName) {
        this.path = path;
        this.classLoaderName = classLoaderName;
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        byte[] data = loadClassData(name);
        return defineClass(name, data, 0, data.length);
    }

    private byte[] loadClassData(String name) {
        InputStream in = null;
        String className = path + name + ".class";
        ByteArrayOutputStream outputStream = null;
        try {
            in = new FileInputStream(new File(className));
            outputStream = new ByteArrayOutputStream();
            int i = 0;
            while ((i = in.read()) != -1) {
                outputStream.write(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                outputStream.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return outputStream.toByteArray();
    }
}
