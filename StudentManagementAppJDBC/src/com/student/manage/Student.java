package com.student.manage;


public class Student {
	private String studentName;
	private String studentPhone;
	private String studentCity;
	private String studentid;
	

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}


//	public Student(int studentId, String studentName, String studentPhone, String studentCity) {
//		super();
//		this.studentName = studentName;
//		this.studentPhone = studentPhone;
//		this.studentCity = studentCity;
//	}

	public Student(String studentName, String studentPhone, String studentCity) {
		super();
		this.studentName = studentName;
		this.studentPhone = studentPhone;
		this.studentCity = studentCity;
	}

//	public Student() {
//		super();
//		// TODO Auto-generated constructor stub
//	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String studentName, String studentPhone, String studentCity, String studentid) {
	super();
	this.studentName = studentName;
	this.studentPhone = studentPhone;
	this.studentCity = studentCity;
	this.studentid = studentid;
}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentPhone=" + studentPhone + ", studentCity=" + studentCity
				+ ", studentid=" + studentid + "]";
	}
}
