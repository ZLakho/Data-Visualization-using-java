/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class Conn {
    Conn()
    {
        try {
              Class.forName("com.mysql.cj.jdbc.Driver");
            //Driver MyDriver = new com.mysql.cj.jdbc.Driver();
            Connection Conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/data","root","Zainab@0335");  
            System.out.println("connected");
            Statement Stmnt = Conn.createStatement();
            ResultSet rs = Stmnt.executeQuery("Select * from students_marks");
            while(rs.next())
            {
                 System.out.println(rs.getString("id") + " " + rs.getString("name") + " " + rs.getString("DLD"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
    public static void main(String[] args) {
        Conn C = new Conn();
        
    }
}

