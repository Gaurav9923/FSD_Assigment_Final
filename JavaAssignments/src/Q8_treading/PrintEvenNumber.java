package Q8_treading;

public class PrintEvenNumber extends Thread {
	
	int [] arr= {1,2,3,4,5,6,7,8,9,10};

	@Override
	public void run() {
		for(int i=0;i<arr.length;i++) {
			
			
			if(arr[i]%2==0)
			System.out.println("even->"+arr[i]);
		}
	}
	

}
