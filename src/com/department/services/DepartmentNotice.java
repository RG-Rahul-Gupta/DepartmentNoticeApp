package com.department.services;

import com.department.details.AdminDepartment;
import com.department.details.HrDepartment;
import com.department.details.SuperDepartment;
import com.department.details.TechDepartment;

public class DepartmentNotice {

	private static void printdepartmentdetails(SuperDepartment department) {
		System.out.println("Welcome to " + department.departmentName());

		if (department instanceof HrDepartment) {
			System.out.println(((HrDepartment) department).doActivity());
		}

		System.out.println(department.getTodaysWork());

		System.out.println(department.getWorkDeadline());

		if (department instanceof TechDepartment) {
			System.out.println(((TechDepartment) department).getTechStackInformation());
		}

		System.out.println(department.isTodayAHoliday() + "\n");
	}

	public static void main(String[] args) {

		SuperDepartment admin = new AdminDepartment();
		SuperDepartment hr = new HrDepartment();
		SuperDepartment tech = new TechDepartment();

		printdepartmentdetails(admin);
		printdepartmentdetails(hr);
		printdepartmentdetails(tech);

	}
}
