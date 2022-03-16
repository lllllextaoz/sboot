package com.qicong.sboot.s19;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping
public class LoginController {

    @RequestMapping("login")
    public ModelAndView login(){
        return new ModelAndView("s19-login");
    }

//    @PostMapping("/login")
//    @ResponseBody
//    public String login(@RequestParam String username, @RequestParam String password, HttpSession session,
//                        RedirectAttributes attributes) {

//        User user = userService.login(username, password);
//
//        if (username.equals("admin") &&password.equals("admin")) {
//            return "sccess";
//        } else {
//            attributes.addFlashAttribute("message", "用户名或密码错误！");
//            return "false";
//        }
//
//        return "200";
//    }

    @PostMapping("/login2")
    @ResponseBody
    public String login2() {

//        User user = userService.login(username, password);
//
//        if (username.equals("admin") &&password.equals("admin")) {
//            return "sccess";
//        } else {
//            attributes.addFlashAttribute("message", "用户名或密码错误！");
//            return "false";
//        }

        return "200";
    }

    @RequestMapping("dologin")
    @ResponseBody
    public String dologin(String username, String password){
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        try{
            subject.login(token);
            return "200";
        }catch (Exception e){
            e.printStackTrace();
            return "failure";
        }
    }

    @RequestMapping("logout")
    public ModelAndView logout(){
        SecurityUtils.getSubject().logout();
        return new ModelAndView("redirect:s19/login");
    }

}
