package com.company;

public class PresentationFactory implements DocumentFactory{
    @Override
    public Document createDocument() {
        return new Presentation();
    }
}
