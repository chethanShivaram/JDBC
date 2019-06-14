package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CreateTable1
{
	public static void main(String[] args) throws Exception
	{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "chethan");
			Statement st= con.createStatement();
			String sql="select * from employee";
			ResultSet rs = st.executeQuery(sql);
			System.out.println("done");		
	}
}