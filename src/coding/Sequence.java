package coding;

import java.util.ArrayList;
import java.util.List;

public class Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxCount = 0;
		int loopCount;

		int startingPoint=10;
		int endingPoint=100;
		List<Integer> values = new ArrayList<>();
		List<Integer> outArr = new ArrayList<>();
			values.add(startingPoint);
			values.add(endingPoint);
		for(int i = startingPoint; i <= endingPoint; i++) {

		    int number = i;
		    loopCount = 1;

		    while(number != 1) {
		        if(number%2 == 0) {
		            number = number/2;
		        } else if(number%2 != 0) {
		            number = (3*number)+1;
		        }
		        loopCount++;
		        values.add(number);
		    }
		    if(loopCount > maxCount){
		        maxCount = loopCount;
		    }
		    System.out.println("Number: " + i + ". " + "Loop count: " + loopCount + ".");
		    if(i==startingPoint || i==endingPoint) {
		    	outArr.add(loopCount);
		    }
		}
		System.out.println("Highest loopCount : " + maxCount);
		System.out.println(outArr);

	}

}
