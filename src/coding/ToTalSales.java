package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ToTalSales {
	public static ArrayList<Integer> convertDigitToArray(int n) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		while(n>0) {
			array.add(n%10);
			n /=10;
		}
		return array;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int firstNum=sc.nextInt();
		int secNum=sc.nextInt();
		ArrayList<Integer> firstMontharr=convertDigitToArray(firstNum);
		Collections.swap(firstMontharr, 0, 1);
		ArrayList<Integer> secMontharr=convertDigitToArray(secNum);
		Collections.swap(secMontharr, 0, 1);
		for(int i=0;i<firstMontharr.size();i++) {
				System.out.print(firstMontharr.get(i)+secMontharr.get(i));
			
		}
		System.out.print(" ");
		for(int i=0;i<firstMontharr.size();i++) {
			System.out.print(+firstMontharr.get(i)-secMontharr.get(i));
		
		}
		System.out.print(" ");
		for(int i=0;i<firstMontharr.size();i++) {
			System.out.print(firstMontharr.get(i)*secMontharr.get(i));
		
		}
	}

}
