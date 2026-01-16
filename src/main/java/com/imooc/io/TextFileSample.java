package com.imooc.io;

import java.io.*;

public class TextFileSample {
    public static void main(String[] args) {
        TextFileSample sample = new TextFileSample();
//        sample.writeTextFile();
//        sample.readTextFile();
//        sample.isrSample();
//        sample.oswSample();
        sample.readBuffer();
    }

    public void readBuffer() {
        Reader reader = null;
        BufferedReader br = null;
        try {
            File file = new File("/Users/kangting/Desktop/java-project/java-demo/src/main/java/com/imooc/io/FileSample.java");
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    //利用OutputStreamWriter 写入文本文件
    public void oswSample() {
        FileOutputStream fos = null;
        OutputStreamWriter osw = null;
        try {
            File file = new File("/Users/kangting/Desktop/java-project/test.txt");
            //创建文件
            if (!file.exists()) {
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            osw = new OutputStreamWriter(fos, "UTF-8");
            osw.write("这是一个新文件！");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (osw != null) {
                    osw.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public void isrSample() {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try {
            File file = new File("/Users/kangting/Desktop/java-project/test.txt");
            fis = new FileInputStream(file);//可以转成字符，文本类型
            isr = new InputStreamReader(fis, "UTF-8");
            StringBuffer buffer = new StringBuffer();
            while (isr.ready()) {
//                System.out.println((char) isr.read());
                buffer.append((char) isr.read());
            }
            System.out.println(buffer.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void readTextFile() {
        Reader reader = null;
        try {
            File file = new File("/Users/kangting/Desktop/java-project/test.txt");
            reader = new FileReader(file);
            int ch = 0;
            while ((ch = reader.read()) != -1) {
                System.out.println((char) ch);//UTF-8 编码集
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public void writeTextFile() {
        Writer writer = null;
        try {
            File file = new File("/Users/kangting/Desktop/java-project/test.txt");
            if (!file.exists()) {
                file.createNewFile();
            }
            writer = new FileWriter(file);
            writer.write("这是一个新文件new");
//            writer.write("：append内容");不能传入null
            writer.append("：append内容");//语义更好
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
