package com.jackiedeng.education.service.impl;

import com.jackiedeng.education.model.User;
import com.jackiedeng.education.service.IUserService;
import com.jackiedeng.education.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void insert(User user) {

    }

    @Override
    public void update(User user) {

    }
}
