package com.company;


import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;


public class StudentXMLFileParserUsingDOM {

    public static void main(String argv[]) {

        try {

            File fXmlFile = new File("/home/vicky/Desktop/students.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(fXmlFile);

            System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

            NodeList nList = doc.getElementsByTagName("student");

            System.out.println("----------------------------"+nList.getLength());

            for (int temp = 0; temp < nList.getLength(); temp++) {

                Node nNode = nList.item(temp);

                System.out.println("\nCurrent Element :" + nNode.getNodeName());

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                    Element eElement = (Element) nNode;

                    System.out.println(" id : " + eElement.getAttribute("id"));
                    System.out.println(" Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Standard : " + eElement.getElementsByTagName("std").item(0).getTextContent());
                    System.out.println("Gender : " + eElement.getElementsByTagName("gender").item(0).getTextContent());
                    System.out.println("Marks : " + eElement.getElementsByTagName("marks").item(0).getTextContent());
                    System.out.println("Address : " + eElement.getElementsByTagName("address").item(0).getTextContent());

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
