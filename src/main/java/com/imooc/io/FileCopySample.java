package com.imooc.io;

import java.io.*;

public class FileCopySample {
    public static void main(String[] args) {
        File source = new File("d:/demo.txt");
        File target = new File("d:/demo.txt");
        InputStream fis = null;
        OutputStream fos = null;
        try {
            //实例化InputStream对象
            fis = new FileInputStream(source);
            fos = new FileOutputStream(target);
            byte[] bs = new byte[1024];
            int len;
            while ((len = fis.read(bs)) != -1) {
                System.out.println(len);
                fos.write(bs, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 通过finally块确保fis对象执行close方法
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
