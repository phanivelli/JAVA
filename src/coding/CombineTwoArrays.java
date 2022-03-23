package coding;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CombineTwoArrays {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sizeStr=sc.nextInt();
		String[] strArray=new String[sizeStr];
		for(int i=0;i<sizeStr;i++) {
			strArray[i]=sc.next();
		}
		int sizeNumeric=sc.nextInt();
		String[] numArray=new String[sizeNumeric];
		for(int i=0;i<sizeNumeric;i++) {
			numArray[i]=sc.next();
		}
		ArrayList<String> merged = new ArrayList<>();
        for (int i = 0; i < Math.max(strArray.length,numArray.length); i++) {
                merged.add(strArray[i]);
                merged.add(numArray[i]);
        }
        System.out.println(String.join(" ", merged));
		
	

	}

	

}
