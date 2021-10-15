package com.company;

public class ResumeFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new Resume();
    }
}
