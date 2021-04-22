package control;

import java.util.Scanner;

public class TestIfelseLadderPositivenegative {
	public static void main(String args[])
	{
		int num;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number:");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.println("Number is positive");
		
		}
		else if(num<0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("Number is Zero");
		}
		sc.close();
	}

}
