package coding;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveChar {
	 private static String remove(String str, char c) {
	        if (str == null || str.length() <= 1)
	            return str;
	        char[] strArray = str.toCharArray();
	        char[] outputArray = new char[strArray.length];
	        int j = 0;
	        for (int i = 0; i < strArray.length; i++) {
	            if (strArray[i]!= c) {
	                outputArray[j] = strArray[i];
	                j++;
	            }
	        }
	        return new String(outputArray, 0, j);
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char c=sc.next().charAt(0);
		String res=remove(str,c);
		System.out.println(res);
	}

}
