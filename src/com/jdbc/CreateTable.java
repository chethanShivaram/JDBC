package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTable
{
public static void main(String[] args)
{
try{
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection(
"jdbc:oracle:thin:@localhost:1521:xe","system","chethan");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("create table employee(eno number,ename varchar2(20),eage number)");
System.out.println(rs);
System.out.println("Table created");
}
catch(Exception e){e.printStackTrace();}
}
}

