package com.qicong.sboot;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import javax.activation.MimetypesFileTypeMap;
import java.io.File;

@SpringBootTest
@Slf4j
class SbootApplicationTests extends AbstractTestNGSpringContextTests {

    @Value("${com.wesite.name:QiDaCong}")
    public String name;


    @Test
    public void test() throws Exception{
        System.out.println(name);
    }

}