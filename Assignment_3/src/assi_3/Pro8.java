package assi_3;

import java.util.Scanner;

public class Pro8 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int age;
		
		System.out.println("Program Start...!");
		
		System.out.print("Enter Age : ");
		
		age = sc.nextInt();
		
		if(age<0)
		{
			ArithmeticException ex = new ArithmeticException("Age is Not Valid");
			throw ex;

		}
		
		System.out.println("Program End...!");
	}

}
