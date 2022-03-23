package coding;

import java.util.Scanner;

public class NSpaceSeparetedInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numFiles = sc.nextInt();
		int[] fileSize = new int[numFiles];
		for(int i=0;i<numFiles;i++) {
			fileSize[i] = sc.nextInt();
		}
		int id;
		for(int i=0; i<numFiles; i++) {
			id = 0; 
			while(fileSize[i]>0) { 
				int temp = fileSize[i]%10; 
				id += temp;
				fileSize[i] /= 10;  
			}
			System.out.print(id+" "); 
		}

	}

}
