package com.company;

public class Main {
    public static void main(String[] args) {
	    DocumentFactory documentFactory = new ReportFactory();
        Document document = documentFactory.createDocument();
        document.display("it's a report of the week.");

        documentFactory = new ResumeFactory();
        Document document2 = documentFactory.createDocument();
        document2.display("This is Resume about me.");

        documentFactory = new PresentationFactory();
        Document document3 = documentFactory.createDocument();
        document3.display("There should be soe Presentation.");
    }
}
