package com.qicong.sboot.s22;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("s22")
public class S22Controller {

    @RequestMapping("index")
    @ResponseBody
    public String index(){

        int i = 1/0;

        return "success";
    }
}
