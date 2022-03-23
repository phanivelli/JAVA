package coding;

import java.util.Scanner;

public class AsciiCodeConvert {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		  char[] ch=s.toCharArray();

		int num=sc.nextInt();
//		print(ch, num);
		String s1="";
		  
		     
		      char c=(char)num;
		      s1=s1+c;
		  
		  System.out.println(s1);
	}

	
}
