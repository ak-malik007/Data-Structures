package base;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr = scan.nextInt();
		
		int i = 0;
		int sum = 0;
		for(i=1; i<=arr; i++)
			
		{
			sum = sum+scan.nextInt();
			
		}
		System.out.println(sum);
	scan.close();
	}


}
