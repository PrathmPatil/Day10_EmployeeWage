package com.bridgelabz_employeeWage;

public class Main {

	public static void main(String[] args) 
	{ int a;
	int b = 0;
		EmployeWage empWage=new EmployeWage();
		/*
		 * use for lop as a 20 working days wage calculation
		 */
		for(int i=0;i<30;i++)
		{
			a=empWage.rNum();
			b=empWage.calWage(a);
		}	
		empWage.display(b);
	}

}
