package com.jdbc;
import java.sql.*;

public class Insertval
{
public static void main(String[] args) 
{
 try{
 Class.forName("oracle.jdbc.driver.OracleDriver");
 Connection con=DriverManager.getConnection(
 "jdbc:oracle:thin:@localhost:1521:xe","system","chethan");
 Statement st=con.createStatement();
 String sql=("insert into login values('chethan','chethan@123')");
 int rs=st.executeUpdate(sql);
 System.out.println(rs);
 System.out.println("Record inserted");
}
catch(Exception e){e.printStackTrace();}
}
}