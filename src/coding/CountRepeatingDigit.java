package coding;

import java.util.Scanner;

public class CountRepeatingDigit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		int freq[]=new int[str.length()];
		int i,j,count=0;
		char charString[]=str.toCharArray();
		for(i=0;i<str.length();i++) {
			freq[i]=1;
			for(j=i+1;j<str.length();j++) {
				if (charString[i]==charString[j]) {
					freq[i]++;
					charString[j]='0';
				}
			}
		}
		for (int k = 0; k < freq.length; k++) {
			if (freq[k]>1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
