package com.company;

public class ReportFactory implements DocumentFactory {
    @Override
    public Document createDocument() {
        return new Report();
    }
}
