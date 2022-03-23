package coding;

import java.util.Arrays;
import java.util.Scanner;

public class MaxOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System. in);
	    String k = in.nextLine();
	    char tempArray[] = k.toCharArray(); 
	    Arrays.sort(tempArray); 
	    String str = new String(tempArray);
	    int maxCount = 0;
	    int count = 1;
	    char ans = '-';
	    for (int i = 1; i <= str.length(); i++){
	       if ((i == str.length()) || (str.charAt(i) != str.charAt(i - 1))){
	                if (maxCount < count)
	                {
	                    maxCount = count;
	                    ans = str.charAt(i-1);
	                }
	                count = 1;
	            }
	            else
	            {
	                count++;
	            }
	        }
	    System.out.println(ans);

	}

}
