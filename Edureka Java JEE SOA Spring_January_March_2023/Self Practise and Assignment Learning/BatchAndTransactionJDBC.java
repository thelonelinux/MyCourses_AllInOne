package com.JDBCProjects;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchAndTransactionJDBC {

    public static void main(String args[])throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");

        System.out.println("Driver loaded...");

        //Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","root","charan");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vickyDB","root","T**G_123");
        System.out.println("Connected to the database");

        //Statement st=con.createStatement();
        Statement stmt=con.createStatement();
        con.setAutoCommit(false);
        stmt.addBatch("update student set name='kevin' where name='kevin mathew'");
        stmt.addBatch("insert into student values('112','Asha', 12, 89)");
        try
        {
            stmt.executeBatch();
            System.out.println("batch executed");
            con.commit();
        }
        catch(Exception e)
        {
            try
            {
                con.rollback();
                System.out.println("batch cancelled");
                e.printStackTrace();
            }
            catch(Exception e1)
            {
                System.out.println(e1);
            }
            con.close();
        }
    }
}
