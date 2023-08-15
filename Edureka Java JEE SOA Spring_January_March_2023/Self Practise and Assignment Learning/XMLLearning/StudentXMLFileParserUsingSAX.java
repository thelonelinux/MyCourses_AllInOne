package com.company;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.FileInputStream;

public class StudentXMLFileParserUsingSAX {
}

class mysaxHandler extends DefaultHandler
{
    public void startDocument()
    {        System.out.println("Document begins here");
    }
    public void startElement(String uri, String localName, String qName, Attributes attrs)
    {      System.out.print("<"+qName + "> " );
    }        public void characters(char ch[],int start,int len)
{
    System.out.print(new String(ch,start,len));
}
    public void endElement(String uri,String localName,String qName)
    {
        System.out.println(" </"+qName+ ">");
    }
    public void endDocument()
    {        System.out.println("Document ends here");
    }
    public static void main(String args[])throws Exception
    {
        SAXParser p= SAXParserFactory.newInstance().newSAXParser();
        p.parse(new FileInputStream("/home/vicky/Desktop/students.xml"),new mysaxHandler());
    }
}




