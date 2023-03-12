package com.driver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;


public class StudentManagement {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("welcome to student management app");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Press 1 to add student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to display student ");
			System.out.println("press 4 to  exit app");
			int c = Integer.parseInt(br.readLine());
			if (c == 1) {
				// add student
				System.out.println("Enter user name  ::");
				String name= br.readLine();
				System.out.println("Enter user phone:::");
				String phone= br.readLine();
				System.out.println("Enter user city ::");
				String city=br.readLine();
				//create student object to store student
				Student st= new Student(name,phone,city);
				boolean answer=StudentDao.insertStudentToDB(st);
				if(answer) {
					System.out.println("Students is added successfully::");
				}else {
					System.out.println("something went wrong!! try again ::");
				}
			System.out.println(st);	
			} else if (c == 2) {
				// delete student
				System.out.println("Enter student id to delete ::::");
				int userId=Integer.parseInt(br.readLine());
				boolean flag1 =StudentDao.deleteStudent(userId);
				if(flag1) {
					System.out.println("Deleted :::::::::");
				}else {
					System.out.println("something went wrong :::");
				}
			} else if (c == 3) {
				// display student
				StudentDao.showAllStudents();
			} else if (c == 4) {
				// exit
				break;
			}else {
				System.out.println("Thank you for using my application:::");
				System.out.println("Thank you visit again!!");
			}
		}

	}
}
