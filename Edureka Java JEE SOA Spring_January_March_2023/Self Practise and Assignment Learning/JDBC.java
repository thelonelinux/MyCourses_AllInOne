package com.JDBCProjects;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class JDBC {

    public static void main(String args[])throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Driver loaded...");

        //Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","charan");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vickyDB","root","T**G_123");
        System.out.println("Connected to the database");

        Statement st=con.createStatement();

        //Create Statement
        System.out.println("Before creating the table...");
        st.execute("create table student(ID varchar(10),NAME varchar(20), CLASS varchar(20), Marks INT)");
        System.out.println("table created");

        //Insert Statement
        st.executeUpdate("insert into student values('109', 'Tenzin', 10, 98)");
        st.executeUpdate("insert into student values('108', 'Vicky', 12, 90)");
        System.out.println("  row inserted");

        //Update Statement
        st.executeUpdate("update student set name='kevin mathew' where name='kevin'");
        System.out.println("row updated");

        //Delete Statement
        st.executeUpdate("delete from student where NAME='Vicky'");
        System.out.println("Vicky Deleted");

        con.close();
        System.out.println("Connection closed...");

    }
}
