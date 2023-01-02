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
 
 int calculateWage(int rNo)
 {
	 if(rNo==0)
	 {
		 int wage=20*8;
		 return wage;
	 }
	 else
	 {
		 return 0;
	 }
 }
 void display(int rNo,int wage)
 {
	 if(rNo==0)
	 {
		 System.out.println("Employee is Present");
		 System.out.println("Total wage is "+wage);
		
	 }
	 else
	 {
		 System.out.println("Employee is Absent");
		 System.out.println("Total wage is "+wage);
		
	 }
 }
 
 
}
