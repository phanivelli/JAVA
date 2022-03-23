package coding;

import java.util.ArrayList;
import java.util.List;

public class CreateSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inferiorLimit = 11;
	    int superiorLimit = 15;

	    for (int i = inferiorLimit; i <= superiorLimit; i++) {
	        System.out.println(calculateConjecture(i));
	    }

	}
	public static List<Integer> calculateConjecture(int number) {
	    List<Integer> values = new ArrayList<>();

	    while (number != 1) {
	        if (number % 2 == 0) {
	            number = number / 2;
	        } else {
	            number = 3 * number + 1;
	        }
	        values.add(number);
	    }

	    return values;
	}

}
