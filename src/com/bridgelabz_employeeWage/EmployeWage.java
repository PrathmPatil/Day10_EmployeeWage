package com.bridgelabz_employeeWage;

import java.util.Random;

public class EmployeWage 
{
 int rNum()
 {
	 Random random=new Random();
	 int number=random.nextInt(2);
	 return number;
 } 
 int calWage(int rNo)
 {
	 if(rNo==1)
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
	 if(rNo==1)
	 {
		 System.out.println("Employe work on part time");
		 System.out.println("Total wage is "+wage);
		
	 }
	 else
	 {
		 System.out.println("Employee not work as a part time");
		 System.out.println("Total wage is "+wage);
		
	 }
 }
 
 
}
