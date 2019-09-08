package cn.kaliuyang.mysit.controller.admin;

import cn.kaliuyang.mysit.model.UserDomain;
import cn.kaliuyang.mysit.service.user.UserService;
import cn.kaliuyang.mysit.utils.APIResponse;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lynnok on 2018/4/20.
 */
@Api("用户管理类")
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/docker")
    @ResponseBody
    public APIResponse<String> dockerTest(){
        return APIResponse.success((Object) "hello docker");
    }
    
}
