package service;

import entity.User;
import java.util.List;
import java.util.Map;

/**
 * @Description
 * @author:awei
 * @date:2019/9/2
 * @ver:1.0
 **/
public interface UserService {

    List<User> allUser(Integer page,Integer limit);

    List<Map<String,Object>> allTeacher();
}
