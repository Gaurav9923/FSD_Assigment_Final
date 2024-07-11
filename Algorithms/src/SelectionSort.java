import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {3,4,2,6,9,1};
		
		for(int i=0;i<nums.length-1;i++) {
			int last=nums.length-i-1;
			int maxIndex=getMaxIndex(nums, 0, last);
			swap(nums,maxIndex,last);
		}
		
		System.out.println(Arrays.toString(nums));

	}
	
	public static void swap(int []arr,int f,int l) {
		int temp=arr[f];
		 arr[f]=arr[l];
		 arr[l]=temp;
		
		
	}
	public static int getMaxIndex(int[]nums,int start,int end) {
		int max=start;
		
		for(int i=start;i<=end;i++) {
			if(nums[max]<nums[i]) {
				max=i;
			}
		}
		return max;
	}

}
