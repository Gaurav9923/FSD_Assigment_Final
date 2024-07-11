import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,4,2,6,9,1};
		
		int size=nums.length;
		boolean flag=false;  //best case check  if array is already sorted
		for(int i=0;i<size-1;i++) {
			
			for(int j=0;j<size-1-i;j++) {
				
				if(nums[j]>nums[j+1]) {
					flag=true; 
					
					int temp=nums[j];
					nums[j]=nums[j+1];
					nums[j+1]=temp;
					
					
				}
			}
			
			if(!flag) {
				break;
			}
		}
		
		System.out.println(Arrays.toString(nums));
	}

}
