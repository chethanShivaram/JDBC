package com.jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DBConnectionUsingPropFile
{
public static void main(String[] args) throws Exception {
	FileInputStream fis=new FileInputStream("D:\\Workspace\\Jdbc Practice\\src\\com\\jdbc\\database.properties");
	Properties properties =new Properties();
	properties.load(fis);
	String dname=properties.getProperty("Dname");
	String url=properties.getProperty("Url");
	String user=properties.getProperty("UserName");
	String password=properties.getProperty("Password");
	try {
		Class.forName(dname);
		Connection connection = DriverManager.getConnection(url, user, password);
		Statement statement =connection.createStatement();
		ResultSet resultset= statement.executeQuery("select * from login");
		while(resultset.next())
		{
			System.out.println(resultset.getString(1) + "  " + resultset.getString(2));
		}
	}
	catch(Exception e)
	{
		System.out.println("Exception in Database code");
		e.printStackTrace();
	}
 }
}
