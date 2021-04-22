package control;

import java.util.Scanner;

/***
 * if(condition1)
 * {
 *  code executed if condition1 is true 
 * }
 * else if(condition2)
 * {
 * code executed if condition2 is true 
 * }
 * else if(condition3)
 * {
 * code executed if condition3 is true 
 * }
 * 
 * else
 * {
 * code executed if all conditions are false
 * }
 * 
 *
 */

public class TestIfElseIfLadder {

	public static void main (String args[])
	{
		int percent;
		System.out.println("Enter Percent: ");
		Scanner sc=new Scanner(System.in);
		percent=sc.nextInt();
		if(percent>=60)
		{
			System.out.println("First class");
		}
		else if((percent<60)&&(percent>40))
		{
			System.out.println("Second class");
		}
		else
		{
			System.out.println("Fail");
		}
		sc.close();
	
	
	}
}
