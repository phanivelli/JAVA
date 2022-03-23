package coding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PrimeDigitSum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		splitDigits(num);
	}

	private static void splitDigits(int num) {
		int[] arr=new int[num];
		while (num > 0) {
			for (int i = 0; i < arr.length; i++) {
				arr[i]=num % 10 ;
			    num = num / 10;
			}
		}
		primeDigitsSum(arr);
	}

	private static void primeDigitsSum(int[] arr) {
		// TODO Auto-generated method stub
		int sum=0;
		int k=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
//			for (int j = 2; j <= i; j++) {
//				System.out.println(arr[i]+""+"%"+j);
//				if (arr[i]%j==0) {
//					k++;
//				}
//				if (k != 2) {
//					sum = sum + arr[i];
//					}
//					
//				
//			}
		}
		
		System.out.println(sum);
		
	}

	

}
