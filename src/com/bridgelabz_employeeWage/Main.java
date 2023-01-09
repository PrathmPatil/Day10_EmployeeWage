package com.bridgelabz_employeeWage;

import java.util.Scanner;

public class Main {
static int nEntries=0;

static int employeeId=1;
	public static void main(String[] args) 
	{  			
		
	    CompanyWage cw1=new CompanyWage("a",10);
	    CompanyWage cw2=new CompanyWage("b",30);
	    CompanyWage cw3=new CompanyWage("c",40);
	    CompanyWage cw4=new CompanyWage("d",50);
	    
	    CompanyWage[] cw=new CompanyWage[4];
	    cw[0]=cw1;
	    cw[1]=cw2;
	    cw[2]=cw3;
	    cw[3]=cw4;
	    
	    EmployeWage ew= new EmployeWage(1,cw);
       ew.printInfo();
	    
	    
	 }

}
