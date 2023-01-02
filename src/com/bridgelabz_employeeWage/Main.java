package com.bridgelabz_employeeWage;

public class Main {

	public static void main(String[] args) 
	{
		EmployeWage empWage=new EmployeWage();
		/*
		 * hold the value and print the value
		 */
		int a=empWage.rNum();
		int b=empWage.calWage(a);
		empWage.display(a,b);
	}

}
