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
 void calWage(int rNo)
 {
	 
	 switch(rNo)
	 {
	 case 0: 
		 int wage=20*8;
		 System.out.println("Total wage is "+wage);
		 break;
	
	 case 1:
		 System.out.println("Total wage is 0");
        break;		
	 }
	
 }
 void display(int rNo)
 {
	 switch(rNo)
	 {
	 case 0: 
		 int wage=20*8;
		 System.out.println("Employe work on part time");
		 break;
	
	 case 1:
		 System.out.println("Employee not work as a part time");
        break;		
	 }
 }
 
 
}
