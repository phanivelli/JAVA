package coding;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
public class ConsecutiveNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int res=countConsecutive(arr);
		System.out.println(res);

	}
	private static int  countConsecutive(int[] arr) {
		Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toCollection(TreeSet::new));
		System.out.println(set);
		if (set.size() != arr.length) {
			return 0;
		}
		int prev = Integer.MAX_VALUE;
		for (int curr: set)
		{
			if (prev != Integer.MAX_VALUE && (curr != prev + 1)) {
				return 0;
			}

			prev = curr;
		}

		return 1;
	}

}
