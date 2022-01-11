package com.qicong.sboot.s21;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * User: 祁大聪
 */
@Controller
@RequestMapping("s21")
public class S21Controller {

    int x=1;

    @RequestMapping("index")
    @ResponseBody
    @CrossOrigin(origins = "*",maxAge = 3600)
    public String index(){

        System.out.println("S21 index 访问了第"+x+"次");
        x++;
        return "success";
    }
}
