package com.briskly.type.helper;
import java.sql.*;
public class connectionProvider
{
 private static Connection con;  
public static Connection getConnection()
{
    try 
    {
        if(con==null)
        {
        //load driver class
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //create COnnection
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/brisklytype","root","root");
        }
    } 
    catch (Exception e)
    {
        e.printStackTrace();
    }
    return con;
}
}