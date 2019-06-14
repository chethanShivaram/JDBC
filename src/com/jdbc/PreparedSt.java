package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedSt
{
public static void main(String[] args)
{
try{
	
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=DriverManager.getConnection(
"jdbc:oracle:thin:@localhost:1521:xe","system","chethan");

Scanner sc=new Scanner(System.in);
System.out.println("Enter Emp Number");
int no=sc.nextInt();
System.out.println("Enter Emp Name");
String name=sc.next();
System.out.println("Enter Emp Age");
int age=sc.nextInt();

PreparedStatement ps=con.prepareStatement("insert into employee values("+no+",'"+name+"',"+age+")");
/*ps.setInt(1,no);
ps.setString(2,name);
ps.setInt(3,age);*/
int i=ps.executeUpdate();
System.out.println(i+"Rows inserted");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
