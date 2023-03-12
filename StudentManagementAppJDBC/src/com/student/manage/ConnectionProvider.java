package com.student.manage;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectionProvider {
	static Connection con;
	public static Connection createConnection() {
// Load the Driver 
		try {
		//getClass();
		Class.forName("com.mysql.cj.jdbc.Driver");
		// create the connection
		String url="jdbc:mysql://localhost:3306/student_manage";
		String user ="root";
		String password="Dibakar@1996";
		
		con = DriverManager.getConnection(url,user, password);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
