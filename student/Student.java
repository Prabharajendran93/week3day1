package org.student;

import org.department.Department;

public class Student extends Department{
	
	public void stdtName()
	{
		System.out.println("the student name");
	}
	
	public void stdtDept()
	{
		System.out.println("the student department");
	}

	public void stdtId()
	{
		
		System.out.println("the student id");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student detail = new Student();
		detail.collegeCode();
		detail.collegeName();
		detail.collegeRank();
		detail.departmentName();
		detail.stdtName();
		detail.stdtDept();
		detail.stdtId();

	}

}
