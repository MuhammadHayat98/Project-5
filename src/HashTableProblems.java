import java.util.Hashtable;

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
				//t
				if(htable.containsKey(array[i])) {
					htable.remove(array[i]);
				}
				else
					htable.put(i, array[i]);
			}
		}
		
		return array;
	}
	
	public static ArrayList<Integer> numbersInCommon(int[] list1, int[] list2) {
		int N = 101;
		Hashtable<String, Integer> inCommon = new Hashtable<String, Integer>(N, 0.75f);
		
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
