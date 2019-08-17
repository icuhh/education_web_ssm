package com.jackiedeng.education.mapper.base;

import com.jackiedeng.education.model.User;
import com.sun.deploy.util.UpdateCheck;

public interface BaseMapper<T>{
    public T findById(Integer id);
    public void deleteById(Integer id);
    public void insert (T t);
    public void update(T t);
}
