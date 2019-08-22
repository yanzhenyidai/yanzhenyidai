package com.yanzhenyidai.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

/**
 * <p>
 * <p>
 * </p>
 *
 * @author tanzhen.frank
 * @since 2019-04-12
 */
public class Test {

    private static final long serialVersionUID = 1L;

    @TableId("id")
    private Long id;

    @TableField("user_name")
    private String userName;

    @TableField("password")
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", userName=" + userName +
                ", password=" + password +
                "}";
    }
}
