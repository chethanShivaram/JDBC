package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system", "chethan");
			String sql="select * from login where username=? and password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			
			Scanner sc = new Scanner(System.in);
			System.out.println("enter username");
			String s1= sc.next();
			
			System.out.println("enter password");
			String s2=sc.next();
			
			pst.setString(1,s1);
			pst.setString(2,s2);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next())
				System.out.println("valid user");
			else
				System.out.println("invalid user");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
