import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTableProblems t = new HashTableProblems();
		//int[] a = t.randomIntArray(20, 30, false);
		//System.out.print(Arrays.toString(a));
		int[] a = {11,28,67,16,47,19,6,35,74,72,36,59,70,32,60,89,95,52,45,22,8,88,50,39,9};
 		int[] b = {32,34,12,65,223,86,37};
		//ArrayList<Integer> c = t.numbersInCommon(b, a);
		//System.out.println(c.toString());
 		System.out.println(t.pairSum(a,75).toString());
	}

}
