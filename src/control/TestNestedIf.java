package control;

import java.util.Scanner;

public class TestNestedIf {
public static void main(String args[]) {
	int age;
	int weight;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter age");
	age=sc.nextInt();
	System.out.println("Enter weight");
	weight=sc.nextInt();
	if(age>=18)
	{
		if(weight>=50)
		{
			System.out.println("You can donate blood");
		}
		else {
			System.out.println("Not eligible to donate blood");
		}
	}
	else
	{
		System.out.println("Age must be above 18");
	}
	
	sc.close();
}
}
