import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableProblems {
	
	public static int[] randomIntArray(int n, int limit, boolean nodups) {
		int[] array = new int[n];
		if(nodups == false) {
			for (int i = 0; i < array.length; i++) {
				int num = (int)(Math.random() * ((limit-1) + 1)) + 1;
				array[i] = num;
			}
		}
		else {
			int N = 101;
			Hashtable<Integer, Integer> htable = new Hashtable<Integer, Integer>(N, 0.75f);
			for(int i = 0; i < array.length; i++) {
				int num = (int)(Math.random() * ((limit-1) + 1)) + 1;
				while(htable.containsKey(num)) {
					num = (int)(Math.random() * ((limit-1) + 1)) + 1;
				}
				array[i] = num;
				
			}
			
		}
		
		return array;
	}
	
	public static ArrayList<Integer> numbersInCommon(int[] list1, int[] list2) {
		int N = 101;
		Hashtable<Integer, Integer> htable = new Hashtable<Integer, Integer>(N, 0.75f);
		ArrayList<Integer> inCommon = new ArrayList<Integer>();
		for(int i = 0; i < list1.length; i++) {
		
			htable.put(new Integer(list1[i]), list1[i]);
			
		}
		
		for(int i = 0; i < list2.length; i++) {
			if(htable.containsKey(list2[i])) {
				inCommon.add(list2[i]);
			}
		}
		return inCommon;
		/*Iterator<Map.Entry<Integer, Integer>> itr = htable.entrySet().iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, Integer> entry = itr.next();
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + "/" + val);
		}*/
		
	}
	public static ArrayList<Tuple> pairSum(int[] nums, int d) {
		int N = 101;
		Hashtable<Integer, Integer> htable = new Hashtable<Integer, Integer>(N, 0.75f);
		ArrayList<Tuple> pair = new ArrayList<Tuple>();
		htable.put(new Integer(d-nums[0]), (d-nums[0]));
		for(int i = 1; i < nums.length; i++) {
			if(htable.containsKey(nums[i])) {
				pair.add(new Tuple(nums[i],(d-nums[i])));
			}
			else {
				htable.put(new Integer(d-nums[i]), (d-nums[i]));
			}
		}
		return pair;
	}
	
}



class Tuple {
	int x;
	int y;
	
	public Tuple(int a, int b) {
		x = a;
		y = b;
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
