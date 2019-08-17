package com.jackiedeng.education.service.base;

public interface IBaseService<T> {
    public T findById(Integer id);
    public void deleteById(Integer id);
    public void insert (T t);
    public void update(T t);
}
