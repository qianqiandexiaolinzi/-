package com.example.demo.dao;

import com.example.demo.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by vickl on 2018/12/3.
 */
public interface UserDao extends CrudRepository<User,String> {
    User save(User user);
}
