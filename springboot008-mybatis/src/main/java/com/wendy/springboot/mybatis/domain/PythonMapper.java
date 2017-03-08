package com.wendy.springboot.mybatis.domain;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author tony.
 */
@Mapper
public interface PythonMapper {

    @Select("SELECT * FROM python WHERE username = #{name}")
    Python findByName(@Param("name") String name);

    @Insert("INSERT INTO python(username) VALUES(#{name})")
    int insert(@Param("name") String name);
}
