package control;

import java.util.Scanner;

public class TestLeapYear {
	public static void main(String args[])
	
	/***
	 * A year is leap, if it is divisible by 4 and 400. But, not by 100.
	 */
	{
		int year;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Year");
		year=sc.nextInt();
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
		{
			System.out.println("Year is leap Year");
		}
		else 
			System.out.println("Year is Common Year");
	sc.close();
	}
	

}
