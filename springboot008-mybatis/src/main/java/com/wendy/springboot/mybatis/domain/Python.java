package com.wendy.springboot.mybatis.domain;

/**
 * @author tony.
 * @since 1.7
 */
public class Python {
    private Integer id;
    private String username;

    @Override
    public String toString() {
        return "Python{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
