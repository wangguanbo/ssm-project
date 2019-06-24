package cn.edmundSofti.controller;

import cn.edmundSofti.interfaces.UserService;
import cn.edmundSofti.pojo.User;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    /**
     * 获取所有用户列表
     * @param request
     * @return
     */
    @RequestMapping("/getAllUser")
    public String getAllUser(HttpServletRequest request, Model model ){
        return "/layOut";
    }

    @RequestMapping("/ajaxGetUserList")
    public void ajaxGetUserList(HttpServletRequest request, Model model, HttpServletResponse response, int page ,int limit){

        Map resultMap = new HashMap();

        try {

            Page<Object> pageHelper = PageHelper.startPage(page, limit);
            List<User> userList = userService.findAll();
            response.setContentType("application/json");
            response.setHeader("Content-type", "text/html;charset=UTF-8");
            resultMap.put("code","0");
            resultMap.put("msg","");
            resultMap.put("count",pageHelper.getTotal());
            resultMap.put("data",userList);
            PrintWriter out = response.getWriter();
            String s = JSONObject.valueToString(resultMap);
            out.write(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * 跳转到添加用户界面
     * @return
     */
    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "/addUser";
    }
    /**
     * 添加用户并重定向
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("/addUser")
    public String addUser(User user,Model model){
        userService.save(user);
        return "redirect:getAllUser";
    }

    /**
     *编辑用户
     * @param user
     * @param request
     * @return
     */
    @RequestMapping("/updateUser")
    public String updateUser(User user,HttpServletRequest request,Model model){
        if(userService.update(user)){
            user = userService.findById(user.getUserId());
            request.setAttribute("user", user);
            model.addAttribute("user", user);
            return "redirect:/user/getAllUser";
        }else{
            return "/error";
        }
    }
    /**
     * 根据id查询单个用户
     * @param userId
     * @param request
     * @return
     */
    @RequestMapping("/getUser")
        public String getUser(int userId,HttpServletRequest request,Model model){
        request.setAttribute("user", userService.findById(userId));
        model.addAttribute("user", userService.findById(userId));
        return "/editUser";
    }
    /**
     * 删除用户
     * @param userId
     * @param request
     * @param response
     */
    @RequestMapping("/delUser")
    public void delUser(int userId, HttpServletRequest request, HttpServletResponse response) {
        String result = "{\"result\":\"error\"}";
        if (userService.delete(userId)) {
            result = "{\"result\":\"success\"}";
        }
        response.setContentType("application/json");
        try {
            PrintWriter out = response.getWriter();
            out.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
