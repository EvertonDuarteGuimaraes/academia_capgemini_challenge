import java.util.ArrayList;
import java.util.Collections;

public class Median {
	public Integer calcMedian(ArrayList<Integer> numbers) { 
		Collections.sort(numbers);
		if(numbers.size() % 2 == 0) {
			return (numbers.get(numbers.size() / 2 - 1) + numbers.get(numbers.size() / 2)) / 2;
		} else {
			return numbers.get(Math.round(numbers.size() / 2));
		}	
	}
}