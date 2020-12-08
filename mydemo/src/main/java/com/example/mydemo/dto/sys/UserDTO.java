package com.example.mydemo.dto.sys;

import com.example.mydemo.dto.base.PageRequestDTO;

public class UserDTO extends PageRequestDTO {
    private String userName;

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
