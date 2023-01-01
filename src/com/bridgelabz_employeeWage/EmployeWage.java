package com.bridgelabz_employeeWage;

import java.util.Random;

public class EmployeWage 
{
 int randomNumber()
 {
	 Random random=new Random();
	 int number=random.nextInt(2);
	 return number;
 }
 void display(int rNo)
 {
	 if(rNo==0)
	 {
		 System.out.println("Employee is Present");
	 }
	 else
	 {
		 System.out.println("Employee is Absent");
	 }
 }
}
