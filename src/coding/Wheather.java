package coding;

import java.util.Arrays;
import java.util.Scanner;

public class Wheather {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numOfLocations = scan.nextInt();
		int[] temp = new int[numOfLocations];
		int max_product = Integer.MIN_VALUE;
		for(int i=0;i<numOfLocations;i++) {
			temp[i] = scan.nextInt();
		}
		 int max_i = temp[0], max_j = temp[1];
		for(int i=0;i<temp.length;i++) {
			for (int j = i+1; j <temp.length ; j++) {
				if (max_product < temp[i] * temp[j])
                {
                    max_product = temp[i] * temp[j];
                    max_i = temp[i];
                    max_j = temp[j];
                }
				
			}
		}
		
		System.out.println(max_i);

	}

}
