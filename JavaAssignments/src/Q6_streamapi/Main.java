package Q6_streamapi;

import java.util.ArrayList;

//Write a Java program that uses stream api to perform operations on a large data set,
//such as sorting or filtering the data.

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<20;i++) {
			list.add((int)Math.round((float)Math.random()*10));
		}
		
		System.out.println(list);
		
		//filtering data by using distinct and sorting		
		list.stream().distinct().sorted().forEach(p->System.err.print(p+" "));
		
		System.out.println();
		
		//filtering data based on even
		list.stream().filter(f->f%2==0).sorted().forEach(p->System.err.print(p+" "));
		
		System.out.println();
		//using map
		list.stream().distinct().sorted().map(m->m*100).forEach(p->System.err.print(p+" "));
		
		
		
	}

}
