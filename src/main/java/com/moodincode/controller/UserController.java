package com.moodincode.controller;
import com.alibaba.fastjson.JSONArray;
import com.moodincode.beans.User;
import com.moodincode.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


/**
 * createBy: moodincode
 * createDate: 2018/7/25 11:25
 * lastModifyDate: 2018/7/25 11:25
 * description:springMVC控制层
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user =userService.getUser(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
    @RequestMapping("/getUserByName")
    public String getUserByName(String name, Model model) {

        User user =userService.getUserByName(name);
        model.addAttribute("user", user);
        return "showUser";
    }
    @RequestMapping("/addUser")
    public String addUser(HttpServletRequest request, Model model) {
     return "addUser";
    }
    @RequestMapping("/saveOrUpdateUser")
    public String saveOrUpdateUser(User user,Model model) {
        if(user.getId()==0){
            userService.add(user);
        }else{
            userService.update(user);
        }

        return "addUser";
    }
    @RequestMapping("/updateUser")
    public String updateUser(HttpServletRequest request,Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user=userService.getUser(userId);
        model.addAttribute("user", user);
        return "updateUser";
    }
    @RequestMapping("/listUser")
    @ResponseBody//此注解告诉视图解析器解析为json数据,若是采用@RestController注解，则不需要写此注解
    public String list(HttpServletRequest request, Model model) {

        List<User> list =userService.list();

        JSONArray json = (JSONArray) JSONArray.toJSON(list);
        return json.toJSONString();
    }

}