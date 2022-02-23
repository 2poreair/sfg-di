package com.cnm.poreair.depinjection.datasource;

public class FakeDataSource {

    private String userName;
    private String password;
    private String jdbCurl;

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

    public String getJdbCurl() {
        return jdbCurl;
    }

    public void setJdbCurl(String jdbCurl) {
        this.jdbCurl = jdbCurl;
    }
}
