package corejava;

import java.util.Scanner;

public class GrossSalary {
	int hra,da; //Declaring global variables
	public void grossSalaryCheack(int sl) {  //creating method to cheack gross salary
		
		// checking in which category entered salary is 
		if(sl<=10000)
		{
			//calculating da and hra
		hra=(sl*20)/100;
		da=(sl*80)/100;
		
		}
		
		else if(sl>=10001 && sl<=20000)
		{
		hra=(sl*25)/100;
		da=(sl*90)/100;
		
		}
		
		else if(sl>=20001)
		{
		hra=(sl*30)/100;
		da=(sl*90)/100;
		
		}
		sl=sl+da+hra; // calculating gross salary and assigning again to sl
		System.out.println("your gross salary is: " +sl);
	}
	public static void main(String[] args) {
		
		int salary; //declaring variables
		System.out.println("enter your salary to cheack gross salary");
		
		Scanner sc= new Scanner(System.in); //creating object for scanner class
		salary=sc.nextInt(); // taking input from user
		
		GrossSalary sal=new GrossSalary(); //creating object for grosssalary class
		sal.grossSalaryCheack(salary); //calling grossSalaryCheack method
		
		
	}

}
