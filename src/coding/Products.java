package coding;

import java.util.Arrays;
import java.util.Scanner;

public class Products {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int res=0;
		String str=sc.next();
		int size= sc.nextInt();
		char [] arr=new char[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.next().charAt(0);
		}
		res=count(str,arr);
		System.out.println(res);
	}

	private static int count(String prdstr,char[] arr) {
		int count=0;
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < prdstr.length(); j++) {
				if (arr[i]==prdstr.charAt(j)) {
					count++;	
				}
			}
			sum +=convertAscii(arr[i],count);
			count=0;
		}
		return sum;
	}
	private static int convertAscii(char c,int count) {
		int ascii = (int) c;
		return ascii*count;
	}
}
