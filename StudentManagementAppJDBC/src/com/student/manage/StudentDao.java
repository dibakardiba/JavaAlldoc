package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class StudentDao {
	public  static boolean insertStudentToDB(Student st) {
		boolean flag= false;
//JDBC CODE .......
		try {
		Connection con = ConnectionProvider.createConnection();
		String query="insert into student(sname,sphone,scity,sid) values(?,?,?,?)";
		// preparedStatements 
		PreparedStatement pstmt = con.prepareStatement(query);
		//SET THE VALUES OF PARAMETERS 
		pstmt.setString(1, st.getStudentName());
		pstmt.setString(2, st.getStudentPhone());
		pstmt.setString(3, st.getStudentCity());
		pstmt.setString(4, st.getStudentid());
		// execute the query
		pstmt.executeUpdate();
		flag=true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	public static boolean deleteStudent(int userId) {
		boolean flag= false;
		//JDBC CODE .......
				try {
				Connection con = ConnectionProvider.createConnection();
				String query="delete from student where sid=?";
				// preparedStatements 
				PreparedStatement pstmt = con.prepareStatement(query);
				//SET THE VALUES OF PARAMETERS 
				pstmt.setInt(1, userId);
				// execute the query
				pstmt.executeUpdate();
				flag=true;
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				return flag;		
	}

	public static void showAllStudents() {
		//JDBC CODE .......
				try {
				Connection con = ConnectionProvider.createConnection();
				String query="select * from student;";
				// Statements 
				Statement st =con.createStatement();
				//SET THE VALUES OF PARAMETERS 
				// execute the query
			ResultSet set=st.executeQuery(query);
			while(set.next()) {
				int id= set.getInt(4);
				String name =set.getString(1);
				String phone=set.getString(2);
				String city=set.getString(3);
				System.out.println(" ID :  " + id);
				System.out.println(" Student name  :  "+name );
				System.out.println(" student phone  :  "+phone );
				System.out.println(" student city  :  "+city );
				System.out.println("**************************************");

			}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
	}
}
