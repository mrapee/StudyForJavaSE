package io;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @program: StudyForJavaSE
 * @description: 列出一些File的常用操作，如过滤、遍历等
 * @author: yuan_shen
 * @create: 2020-02-22 13:44
 **/

public class FileUtils {
    public static void main(String[] args){
        listDirectory(new File("d:\\test"));
    }

    public static void listDirectory(File dir) {
        if (!dir.exists())
            //抛出非法参数异常
            throw new IllegalArgumentException("目录：" + dir + "不存在。");
        if (!dir.isDirectory())
            throw new IllegalArgumentException(dir + "不是目录");

        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isDirectory())
                listDirectory(file);
            else System.err.println(file);
        }
    }


}
