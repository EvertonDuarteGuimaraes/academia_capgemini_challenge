import java.util.ArrayList;
import java.util.Collections;

public class Median {
	public Integer findMedian() {
		ArrayList<Integer> numbers = new ArrayList<>(); Collections.addAll(numbers, 1, 2, 3, 4, 5, 6);
		Collections.sort(numbers);
		if(numbers.size() % 2 == 0) {
			return (numbers.get(numbers.size() / 2 - 1) + numbers.get(numbers.size() / 2)) / 2;
		} else {
			return numbers.get(Math.round(numbers.size() / 2));
		}	
	}
}
