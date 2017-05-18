package cn.com.myBoot.controller;

import cn.com.myBoot.dao.UserRepository;
import cn.com.myBoot.entity.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;


@Controller
public class UserController {
    @Resource
    private UserRepository serRepository;
    @RequestMapping("/hello")
    public String index(Model model){
        return "/hello";
    }
    @RequestMapping("/login")
    public String login(HttpServletRequest request,Model model){
        String name=request.getParameter("name");
        String password=request.getParameter("password");

        User user=serRepository.findUser(name);
        if(password.equals(user.getUserPassword())){
            return "/user";
        }else{
            return "/401";
        }
    }
}
