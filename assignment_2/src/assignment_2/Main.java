package assignment_2;
import java.util.Scanner;

import assignment_2.UserMainCode;

public class Main {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter array size");
		int n = s.nextInt();
		int array[] = new int[n];
		System.out.print("enter all the numbers");
		for(int j=0;j<n;j++)
		{
			array[j]=s.nextInt();
		}
		boolean x= UserMainCode.checkTripplets(array);		
			if(x)
			System.out.println("triplets found");
			else
			System.out.println("not found");
	
	}
	
	
}
