
public class Assignment_2 {
	
	public static void main(String[] args) {
		findDuplicateInArray();
		
	}
	
	
	public static void findDuplicateInArray() {
		int [] arr= {1,2,3,4,5,6,3,4};
		String ans="";
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
				
				if(count==0) {
					continue;
				}else {
					ans=arr[j]+","+ans;
					break;
				}
				
				
			}
		}
		
		System.out.println("Duplicate Nubers from given array are ::" +ans);
		
	}
	
	public static void quickSortAlgorithm() {
		
	}
}
