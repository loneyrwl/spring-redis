package com.test.model;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/9/5.
 */
public class UsrUser implements Serializable{

    private String id;

    private String username;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UsrUser{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
