package io;

import java.io.File;
import java.io.IOException;

/**
 * @program: StudyForJavaSE
 * @description: 学习File类的常用方法
 * @author: yuan_shen
 * @create: 2020-02-22 13:27
 **/

public class FileAPI {
    /**
     * File类只用于表示文件（或目录）的信息（名称、大小等），不能用于文件内容的访问
     * @param args
     */
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\test");
        //file是否存在
        System.err.println(file.exists());
        if (!file.exists())
            file.mkdir();
        //多级目录file.mkdirs();
        //file是否是目录（如果是目录返回true，如果不是目录或不存在返回false）
        System.err.println(file.isDirectory());
        //file是否是文件
        System.err.println(file.isFile());

        //File file1 = new File("d:/test/test.txt");
        File file1 = new File("d:/test","text.txt");
        if (!file1.exists())
            file1.createNewFile();

        //常用File对象的API
        System.err.println(file);
        System.err.println(file1);
        System.err.println(file1.getAbsolutePath());
        System.err.println(file.getAbsolutePath());
        System.err.println(file.getName());
        System.err.println(file1.getName());
        System.err.println(file.getParent());
        System.err.println(file1.getParent());
        System.err.println(file1.getParentFile());

    }
}
