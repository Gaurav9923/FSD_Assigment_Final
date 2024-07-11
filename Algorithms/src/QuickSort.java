import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] nums = {3,4,2,6,9,1};
		
		quickSort(nums, 0, nums.length-1);
		
		System.out.println(Arrays.toString(nums));
	}
	
	public static void  quickSort(int [] arr,int low,int high) {
		if(low>=high) {
			return;
		}
		
		int start=low;
		int end=high;
		int mid=start+(end-start)/2;
		int pivot=arr[mid];
		
		while(start<=end) {
			
			while(arr[start]<pivot) {
				start++;
			}
			
			while(arr[end]>pivot) {
				end--; 
			}
			
			if(start<=end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				
				start++;
				end--;
				
			}
			
		}
		
		//pivot at correct index  now sort left  and right array of pivot
		
		quickSort(arr, low, end);
		quickSort(arr, start, high);
	}

}
