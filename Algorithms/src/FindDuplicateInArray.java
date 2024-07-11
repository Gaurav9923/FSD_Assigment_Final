import java.util.HashMap;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {1,1,2,3,3,4,5};
		
		HashMap<Integer, Integer> map=new HashMap<>();
		
		for(int x: nums) {
			map.put(x, 0);
		}
		
		
		for(int x: nums) {
			if(map.containsKey(x)){
				int val=map.get(x)+1;
				map.put(x, val);
			}
		}
		System.out.println(map);
		

	}

}
