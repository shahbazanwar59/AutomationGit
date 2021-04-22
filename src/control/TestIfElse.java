package control;

import java.util.Scanner;

public class TestIfElse {
	public static void main(String args[])
	{
		int age;
		System.out.println("Enter age ");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Eligble for vote");
			
		}
		else 
		{
			System.out.println("Not Eligble for Vote");
		}
		sc.close();
		
	}

}
