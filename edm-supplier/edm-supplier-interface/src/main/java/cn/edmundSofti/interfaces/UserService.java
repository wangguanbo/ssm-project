package cn.edmundSofti.interfaces;

import cn.edmundSofti.pojo.User;

import java.util.List;

public interface UserService {

    void save(User user);

    boolean update(User user);

    boolean delete(int id);

    User findById(int id);

    List<User> findAll( );

}
