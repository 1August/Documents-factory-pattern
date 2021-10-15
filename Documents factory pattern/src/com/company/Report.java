package com.company;

public class Report implements Document{
    @Override
    public void display(String text) {
        System.out.println("I'm Report. " + text);
    }
}
