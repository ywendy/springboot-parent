package com.wendy.springboot.mybatis.mapper;

import com.wendy.springboot.mybatis.entry.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2017/4/8 0008.
 */
@Mapper
public interface UserMapper {

    public User selectById(Long useId);

    public List<User> list();

}
