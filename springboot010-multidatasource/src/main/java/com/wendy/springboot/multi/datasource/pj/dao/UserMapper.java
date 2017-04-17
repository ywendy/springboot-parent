package com.wendy.springboot.multi.datasource.pj.dao;

import com.wendy.springboot.multi.datasource.pj.domain.User;

/**
 * Created by Administrator on 2017/4/18 0018.
 */
public interface UserMapper {

   public User getUserById(Integer userId);
}
