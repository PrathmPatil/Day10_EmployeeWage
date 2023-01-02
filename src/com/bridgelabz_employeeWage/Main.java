package com.bridgelabz_employeeWage;

public class Main {

	public static void main(String[] args) 
	{
		EmployeWage employewage=new EmployeWage();
		/*
		 * hold the value and print the value
		 */
		int a=employewage.randomNumber();
		int b=employewage.calculateWage(employewage.randomNumber());
		employewage.display(a,b);
	}

}
