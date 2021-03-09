package com.sit.jichen.dao;

public class ConcreteUser implements AbstractUser {
    @Override
    public void update() {
        System.out.println("ConcreteUser update..............");
    }
}
