package cn.edmundSofti.controller;

import cn.edmundSofti.interfaces.UserService;
import cn.edmundSofti.pojo.User;
import com.baidu.aip.ocr.AipOcr;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description 用户管理控制器
 *
 * @Author wangguanbo
 * @Date 13:49 2019/6/24
 * @return 
 **/
@RestController
@RequestMapping("/forUser")
public class UserManagerController {

    @Autowired
    private UserService userService;

    @RequestMapping("/testOcr")
    public String testOcrBaiduAip(){
        File file = new File("C:/Users/Mr.GuanBo/Desktop/test1.png");
        AipOcr ocr = new AipOcr("16709806", "UdiUSw3IycG4MZ8GMOElGNG4", "qC0cPHjMFjO0SjwVUCl04zvFPx3X60wC");
        /*ocr.setConnectionTimeoutInMillis(2000);
        ocr.setSocketTimeoutInMillis(50000);*/
        JSONObject jsonObject = ocr.basicGeneral(file.getPath(), new HashMap<String, String>(1));
        return jsonObject.toString();
    }

    @RequestMapping("/getUserList")
    public List<User> getUserList(){
        return userService.findAll();
    }

    @RequestMapping("/findUserById")
    public User findUserById(int userId){
        if (0 == userId) {
            return new User();
        }
        return userService.findById(userId);
    }

    @RequestMapping("/updateUserByUserId")
    public boolean updateByUserId(User user){
        if (null == user || null == user.getUserId()) {
            return false;
        }
        return userService.update(user);
    }

    @RequestMapping("/deleteUserByUserId")
    public boolean deleteUserByUserId(int userId){
        if (0 == userId) {
            return false;
        }
        return userService.delete(userId);
    }

    @RequestMapping("/addUser")
    public boolean addUser(User user){
        String userName = user.getUserName();
        if (StringUtils.isEmpty(userName)) {
            return false;
        }
        userService.save(user);
        List<User> all = userService.findAll();
        if (!CollectionUtils.isEmpty(all)) {
            List<User> collect = all.stream().filter(s1 -> s1.getUserName().equals(userName)).collect(Collectors.toList());
            return !CollectionUtils.isEmpty(collect);
        }
        return true;
    }




}
