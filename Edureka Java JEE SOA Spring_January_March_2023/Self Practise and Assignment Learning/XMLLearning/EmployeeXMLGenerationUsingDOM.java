package com.company;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.FileOutputStream;


public class EmployeeXMLGenerationUsingDOM {

    public static void main(String args[])throws Exception
    {
        DocumentBuilderFactory f=DocumentBuilderFactory.newInstance();
        DocumentBuilder b=f.newDocumentBuilder();
        Document doc=b.newDocument();
        Element rootele=doc.createElement("Employees");
        Element studentele=doc.createElement("Employee");
        Element idle=doc.createElement("employeeID");
        Element nameele=doc.createElement("name");
        Element deptle=doc.createElement("department");

        Text t1=doc.createTextNode("Charan");
        Text t2=doc.createTextNode("1");
        Text t3=doc.createTextNode("HR");

        nameele.appendChild(t1);
        idle.appendChild(t2);
        deptle.appendChild(t3);

        studentele.appendChild(nameele);
        studentele.appendChild(idle);
        studentele.appendChild(deptle);

        rootele.appendChild(studentele);
        doc.appendChild(rootele);
        Transformer t= TransformerFactory.newInstance().newTransformer();
        t.transform(new DOMSource(doc),new StreamResult(new FileOutputStream("/home/vicky/Desktop/employees.xml")));
        System.out.println("XML file generated..");
    }
}
