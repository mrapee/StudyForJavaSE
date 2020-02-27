package io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * @program: StudyForJavaSE
 * @description: 编码格式学习
 * @author: yuan_shen
 * @create: 2020-02-22 12:38
 **/

public class Encode {
    /**
     * gbk编码：汉字占两个字节，英语字母占一个字节
     * utf8编码：汉字占三个字节，英语字母占一个字节
     * utf16be编码：汉字占两个字节，英语字母占一个字节（java内部采用该编码方法，java是双字节编码）
     * @param args
     * @throws UnsupportedEncodingException
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str = "袁申ABC";

        byte[] defaultBytes = str.getBytes();
        byte[] gbkBytes = str.getBytes("GBK");
        byte[] utf8Bytes = str.getBytes("utf-8");
        byte[] utf16Bytes = str.getBytes("utf-16be");
        System.err.print("默认：");
        for (byte defaultByte : defaultBytes) {
            System.err.print(Integer.toHexString(defaultByte & 0xff) + " ");
        }
        System.err.print("\n"+"gbk：");
        for (byte gbkByte : gbkBytes) {
            System.err.print(Integer.toHexString(gbkByte & 0xff) + " ");
        }
        System.err.print("\n"+"utf8：");
        for (byte utf8Byte : utf8Bytes) {
            System.err.print(Integer.toHexString(utf8Byte & 0xff) + " ");
        }
        System.err.print("\n"+"utf16be：");
        for (byte utf16Byte : utf16Bytes) {
            System.err.print(Integer.toHexString(utf16Byte & 0xff) + " ");
        }
        System.err.println();

        /**
         * 当你的字节序列是某种编码时，这个时候想把字节序列
         * 变成字符串，也需要使用这种编码方式，否则会乱码
         */
        byteToString(defaultBytes,Charset.defaultCharset());
        byteToString(gbkBytes,Charset.forName("GBK"));
        byteToString(utf8Bytes,Charset.forName("utf-8"));
        byteToString(utf16Bytes,Charset.forName("utf-16be"));
    }

    public static void byteToString(byte[] bytes, Charset charset){
        String str = new String(bytes,charset);
        System.err.println(str);
    }
}
