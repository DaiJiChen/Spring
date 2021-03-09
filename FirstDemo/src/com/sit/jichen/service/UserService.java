package com.sit.jichen.service;

import com.sit.jichen.dao.AbstractUser;

public class UserService {
    private AbstractUser user;

    public void setUser(AbstractUser user) {
        this.user = user;
    }

    public void add() {
        System.out.println("Service add............");
        user.update();
    }
}
