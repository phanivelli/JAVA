package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

import coding.NoorAndFish.FastReader;

public class MaxWater {
	static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
        public FastReader() 
        { 
        	 br= new BufferedReader(new InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }

	public static void main(String[] args) {
		FastReader sc = new FastReader();
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i=0;i!=n;++i){
            arr[i]=sc.nextInt();
        }
		int sum = 0, i = 0, j = arr.length-1, res = 0;
        while (i < j) {
            if (arr[i] <= arr[j]) {
                res = arr[i] * (j - i);
                i++;
            } else {
                res = arr[j] * (j - i);
                j--;
            }
            if (res > sum) sum = res;
        }
        System.out.println(sum);

	}

}
