package com.department.services;

import com.department.details.AdminDepartment;
import com.department.details.HrDepartment;
import com.department.details.SuperDepartment;
import com.department.details.TechDepartment;

public class DepartmentNotice {

	private void printdepartmentdetails(SuperDepartment department) 
	{
		String departmentname = department.departmentName();
		System.out.println("Welcome to " + departmentname);
		
		if (department instanceof HrDepartment) 
		{
			String groupActivity = ((HrDepartment)department).doActivity();
			System.out.println(groupActivity);
		}
		
		String todayswork = department.getTodaysWork();
		System.out.println(todayswork);
		String deadline = department.getWorkDeadline();
		System.out.println(deadline);
		
		if (department instanceof TechDepartment) 
		{
			String stackInfo = ((TechDepartment)department).getTechStackInformation();
			System.out.println(stackInfo);
		}
		
		String workingoff = department.isTodayAHoliday();
		System.out.println(workingoff + "\n");
	}

	public static void main(String[] args) {

		SuperDepartment admin = new AdminDepartment();
		SuperDepartment hr = new HrDepartment();
		SuperDepartment tech = new TechDepartment();
		DepartmentNotice notice = new DepartmentNotice();

		notice.printdepartmentdetails(admin);
		notice.printdepartmentdetails(hr);
		notice.printdepartmentdetails(tech);

	}
}
