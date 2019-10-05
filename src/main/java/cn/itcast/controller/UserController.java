package cn.itcast.controller;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model) {
        System.out.println("testString方法执行了");
        User user=new User();
        user.setUsername("美美");
        user.setPassword("123456");
        user.setAge(22);
        model.addAttribute("user",user);
        return "success";
    }

    @RequestMapping("/testMondelAndView")
    public ModelAndView testMondelAndView() {
        ModelAndView mv=new ModelAndView();
        System.out.println("testMondelAndView");
        User user=new User();
        user.setUsername("美美");
        user.setPassword("123456");
        user.setAge(22);
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/testAjax")
    @ResponseBody
    public User testAjax(@RequestBody User user) {
        System.out.println("testAjax方法执行了");
        System.out.println(user);
//        user.setUsername("haha");
//        user.setAge(40);
        return user;
    }
}
