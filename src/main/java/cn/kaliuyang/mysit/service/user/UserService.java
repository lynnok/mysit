package cn.kaliuyang.mysit.service.user;

import cn.kaliuyang.mysit.model.UserDomain;

import java.util.List;
import org.springframework.stereotype.Service;
/**
 * Created by lynnok on 2018/4/20.
 */
@Service
public interface UserService {

    /**
     * @Author: lynnok
     * @Description: 更改用户信息
     * @Date: 2018/4/20
     * @param user
     */
    int updateUserInfo(UserDomain user);

    /**
     * @Author: lynnok
     * @Description: 根据主键编号获取用户信息
     * @Date: 2018/4/20
     * @param uId 主键
     */
    UserDomain getUserInfoById(Integer uId);


    /**
     * 用户登录
     * @param username 用户名
     * @param password 密码
     * @return
     */
    UserDomain login(String username, String password);

}
