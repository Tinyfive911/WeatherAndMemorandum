package com.tinyfive.weatherandmemorandum.model;

import java.io.Serializable;

/**
 * Created by wj on 2018/5/15.
 */

public class User implements Serializable{

    public String name;
    public String loginName;
    public String psw;

    public User() {
    }

    public User(String name, String loginName, String psw) {
        this.name = name;
        this.loginName = loginName;
        this.psw = psw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPsw() {
        return psw;
    }

    public void setPsw(String psw) {
        this.psw = psw;
    }
}
