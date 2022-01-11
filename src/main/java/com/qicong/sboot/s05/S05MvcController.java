package com.qicong.sboot.s05;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping
public class S05MvcController {

    int x=1;

    @RequestMapping
//    @CrossOrigin(origins = "*",maxAge = 3600)
    public ModelAndView index(){

        System.out.println("S05MvcController:: index 访问了第"+x+"次");
        x++;
        return new ModelAndView("s05.html");
    }

}
