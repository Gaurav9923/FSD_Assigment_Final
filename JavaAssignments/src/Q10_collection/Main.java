package Q10_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

//Write a Java program that reads a set of integers from the user and stores them in a
//List. The program should then find the second largest and second smallest elements
//in the List.

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		ArrayList<Integer> list=new ArrayList<>();
		
		System.out.println("Enter total number element you want to give in imput :: ");
		int n= sc.nextInt();
		
		System.out.println("Enter input elemnts");
		for(int i=0;i<n;i++) {
			list.add(sc.nextInt());
		}
		
		System.out.println("User input-->"+list);
		
		Collections.sort(list);
		
		System.out.println("Sorted-->"+list);
		
		System.out.println("Second Largest::"+list.get(list.size()-2));
		System.out.println("Second Smallest::"+list.get(1));
	}

}
