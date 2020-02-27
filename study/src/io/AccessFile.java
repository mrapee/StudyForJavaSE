package io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/**
 * @program: StudyForJavaSE
 * @description: 访问文件方法
 * @author: yuan_shen
 * @create: 2020-02-23 11:34
 **/

public class AccessFile {

    public static void main(String[] arg) throws IOException {
        File dir = new File("demo");
        if (!dir.exists())
            dir.mkdir();
        File file = new File(dir,"test.ini");
        if (!file.exists())
            file.createNewFile();
        accessFile(file);
    }
    /**
     * java文件模型
     *    在硬盘上的文件是按一个个字节存储的
     * 打开文件
     *    有两种模式“rw”（读写） “r”（只读）
     * 文件指针
     *    打开文件时，指针在开头，pointer = 0
     * 写方法
     *    raf.write(int) 只写一个字节（后八位），指针指向下一个位置
     * 使用RandomAccessFile类可以读写文件，但每次只能读写一个字节。
     * 它支持在任意位置进行读写操作
     * @param file
     */
    public static void accessFile(File file) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(file,"rw");
        System.err.println("初始指针位置：" + raf.getFilePointer());
        //写入char类型
        raf.write('A');
        raf.write('a');
        System.err.println(raf.getFilePointer());
        //写入int类型(write方法每次只能写一个字节)
        int i = 0x7fffffff;
        raf.write(i >>> 24);//存入高8位
        raf.write(i >>> 16);//存入第二个8位
        raf.write(i >>> 8 );//存入第三个8位
        raf.write(i);//存入后8位
        System.err.println(raf.getFilePointer());
        //也可以使用writeInt方法一次写入int
        raf.writeInt(i);
        System.err.println(raf.getFilePointer());

        //写入byte[]数组
        String str = "武汉加油";//项目默认utf-8格式，中文占3个字节
        byte[] bytes = str.getBytes();
        raf.write(bytes);
        System.err.println(raf.length());

        //读取file内容，首先要把指针指向0
        raf.seek(0);
        //一次性读取全部内容
        byte[] buf = new byte[(int)raf.length()];
        raf.read(buf);
        System.err.println(Arrays.toString(buf));
        for (byte b : buf) {
            System.err.print(Integer.toHexString(b & 0xff) + " ");
        }
    }
}
