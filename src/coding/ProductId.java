package coding;

import java.util.Arrays;
import java.util.Scanner;

public class ProductId {
	static int largestPermutation(int n)
	{
	    int temp = n, count = 0;
	    int result=0;   int factor=0;
	    while (temp > 0)
	    {
	      count++;
	      temp /= 10;
	    }
	    int[] num = new int[count];
	    while (n > 0)
	    {
	      num[count-- - 1] = n % 10;
	      n = n / 10;
	    }
	    while (isPermutation(num))
	    {
	    	for (int i = 0; i < num.length; i++) {
		        result = num[i] + factor * 10;
		        factor = result;
		    }
	    }
		return result;
	  }
	  static boolean isPermutation(int[] p)
	  {
	    for (int a = p.length - 2; a >= 0; --a)
	      if (p[a] < p[a + 1])
	        for (int b = p.length - 1;; --b)
	          if (p[b] > p[a])
	          {
	            int t = p[a];
	            p[a] = p[b];
	            p[b] = t;
	            for (++a, b = p.length - 1; a < b; ++a, --b)
	            {
	              t = p[a];
	              p[a] = p[b];
	              p[b] = t;
	            }
	            return true;
	          }
	    return false;
	  }
	private static int smallestPermutation(int number) {
		String num=Integer.toString(number);
		int n = num.length();
		int[] digit = new int[10];
		String zero = "";
		String result = "";
		for (int index = 0; index < 10; ++index)
		{
			digit[index] = 0;
		}
		for (int index = 0; index < n; ++index)
		{
			if (num.charAt(index) == '0')
			{
				zero += "0";
			}
			else
			{
				digit[num.charAt(index) - '0'] += 1;
			}
		}
		for (int index = 1; index < 10; ++index)
		{
			if (digit[index] != 0)
			{
				while (digit[index] > 0)
				{
					result += "" + index;
					digit[index]--;
				}
				result += zero;
				zero = "";
			}
		}
		result += zero;
		
		return Integer.parseInt(result);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int largest=largestPermutation(num);
		int small=smallestPermutation(num);
		System.out.println(small+largest);

	}
}
