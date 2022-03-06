import java.util.ArrayList;

public class Median {
	public Integer calc(ArrayList<Integer> numbers) { 
		if(numbers.size() % 2 == 0) {
			return (numbers.get(numbers.size() / 2 - 1) + numbers.get(numbers.size() / 2)) / 2;
		} else {
			return numbers.get(Math.round(numbers.size() / 2));
		}	
	}
}