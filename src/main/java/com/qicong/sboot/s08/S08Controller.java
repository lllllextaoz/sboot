package com.qicong.sboot.s08;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("s08")
public class S08Controller {

    @Value("${com.wesite.name:QiDaCong}")
    public String name;

    @Autowired
    public ResourceConfig resource;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        System.out.println("name = " + name);
        System.out.println("resource.url = " + resource.getUrl());
        return "success" + name + " , " + resource.getName() + " == ";
    }
    @RequestMapping("login")
    @ResponseBody
    public String login(){
        return "200";
    }
}
