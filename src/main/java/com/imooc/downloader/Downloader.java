package com.imooc.downloader;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class Downloader {
    public static void main(String[] args) {
        Downloader downloader = new Downloader();
        downloader.download("https://pic1.zhimg.com/v2-6b6a983b42742a373670b8b85c16c2ae.jpg", "/Users/kangting/Desktop/2025-kt");
    }

    /**
     * 下载单个文件保存到本地
     *
     * @param source    原图片的网址
     * @param targetDir 目标目录，要确保已存在
     */
    public void download(String source, String targetDir) {
        InputStream is = null;
        OutputStream os = null;
        try {
            String fileName = source.substring(source.lastIndexOf("/") + 1);
            File targetFile = new File(targetDir + "/" + fileName);
            if (!targetFile.exists()) {
                targetFile.createNewFile();
            }
            URL url = new URL(source);
            URLConnection connection = url.openConnection();
            is = connection.getInputStream();
            os = new FileOutputStream(targetFile);
            byte[] bs = new byte[1024];
            int len = 0;
            while ((len = is.read(bs)) != -1) {
                os.write(bs, 0, len);
            }
            System.out.println("[INFO]图片下载完毕" + source + "\n\t ->" + targetFile.getPath() + "(" + Math.floor(targetFile.length() / 1024) + "kb)");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (os != null) {
                    os.close();
                }
                if (is != null) {
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
