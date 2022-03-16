package com.qicong.sboot;

import org.junit.jupiter.api.Test;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;
import java.io.IOException;
import java.net.FileNameMap;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 取文件Content-Type
 *
 * @author gormanbeatrice
 * @create 2022 03 14 21:46
 */
public class ContentTypeTest {

//    String filePath = "/Users/gormanbeatrice/Desktop/607080.txt";
    String filePath = "/Users/gormanbeatrice/Desktop/笔记.pdf";


    @Test
    public void test1(){

        Path path = Paths.get(filePath);
        String contentType = null;
        try {
            contentType = Files.probeContentType(path);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("File content type is : " + contentType);
    }

    @Test
    public void test2(){
        String contentType = new MimetypesFileTypeMap().getContentType(new File(filePath));
        System.out.println(contentType);
    }

    @Test
    public void test3(){
        FileNameMap fileNameMap = URLConnection.getFileNameMap();
        String contentType = fileNameMap.getContentTypeFor(filePath);
        System.out.println(contentType);
    }

    @Test
    public void test4(){
        String filePath = "C:\\Users\\its10\\Desktop\\租赁合同1.pdf";
        File file = new File(filePath);
        String contentType = new MimetypesFileTypeMap().getContentType(file);
    }
}
