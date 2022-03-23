package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NoorAndFish {
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
		// TODO Auto-generated method stub
		 FastReader sc = new FastReader();
	     
	         int n=sc.nextInt();
	         int[] a=new int[n];
	         int[] b=new int[n];
	         for(int i=0;i!=n;++i){
	             a[i]=sc.nextInt();
	             b[i]=sc.nextInt();
	         }
	         Arrays.sort(a);
	         Arrays.sort(b);
	         int y=0,count=n;
	         for(int i=1;i!=n;++i){
	             if(b[i]>=a[y]){
	                 ++y;
	                 --count;
	             }
	         }
	         System.out.println(count);
	     

	}

}
