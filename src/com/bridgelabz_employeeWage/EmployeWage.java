package com.bridgelabz_employeeWage;

import java.util.Random;

public class EmployeWage 
{
	int sum=0;
 int rNum()
 {
	 Random random=new Random();
		 int number=random.nextInt(2);
		 return number;	 
 } 
 int calWage(int rNo)
 {
	if(rNo==0)
	{
		return sum;
	}
	else
	{
		sum=20*8+sum;
		return sum;
	}
	
 }
 void display(int sum)
 {
	 System.out.println("Total wage of Working Days is "+sum);
 }
 }
