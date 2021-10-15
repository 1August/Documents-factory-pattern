package com.company;

public class Resume implements Document{
    @Override
    public void display(String text) {
        System.out.println("I'm Resume. " + text);
    }
}
