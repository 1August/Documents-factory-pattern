package com.company;

public class Presentation implements Document{
    @Override
    public void display(String text) {
        System.out.println("I'm Presentation. " + text);
    }
}
