package Q3_Exception;

import java.util.Scanner;

public class Main {
	public static void main(String[] args)  throws CustomNegativeException{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Any Integer:: ");
		Integer input=sc.nextInt();
		
		if(input<0) {
			throw new CustomNegativeException("Negative Number Exception");
		}
		
	}
}
