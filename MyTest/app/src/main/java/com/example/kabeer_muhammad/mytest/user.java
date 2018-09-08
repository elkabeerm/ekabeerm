package com.example.kabeer_muhammad.mytest;

public class user {
    String uname;
    String pwd;
    String uid;

    public user(String uid) {
        this.uid = uid;
    }

    public user(String uname,String pwd,String uid){
        this.uname=uname;
        this.pwd=pwd;
        this.uid=uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
