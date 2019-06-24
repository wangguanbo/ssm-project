package cn.edmundSofti.service;

import cn.edmundSofti.interfaces.UserService;
import cn.edmundSofti.mapper.UserMapper;
import cn.edmundSofti.pojo.User;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public void save(User user) {
        userMapper.insert(user);
    }

    @Override
    public boolean update(User user) {
        return userMapper.updateByPrimaryKey(user) > 0 ? true : false ;
    }

    @Override
    public boolean delete(int id) {
        return userMapper.deleteByPrimaryKey(id) > 0 ? true : false ;
    }

    @Override
    public User findById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
