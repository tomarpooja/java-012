package com.ihub.www;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectApp {
	public static void main(String[] args)throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
		Statement st=con.createStatement();
		
		String qry="select * from student";
		
		ResultSet rs=st.executeQuery(qry);
		
		while(rs.next())
		{
			System.out.println(rs.getInt("sno")+" "+rs.getString("sname")+" "+rs.getString("sadd"));
		}
		
		rs.close();
		st.close();
		con.close();
		
	}
}
