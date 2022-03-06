import java.util.ArrayList;
import java.util.Collections;

public class Median {
	public ArrayList<Integer> numbers;
	
	public Median(ArrayList<Integer> numbers) {
		this.numbers = new ArrayList(numbers);
	}
	
	public Integer calc() { 
		if(this.numbers.size() % 2 == 0) {
			return (this.numbers.get(this.numbers.size() / 2 - 1) + this.numbers.get(this.numbers.size() / 2)) / 2;
		} else {
			return this.numbers.get(Math.round(this.numbers.size() / 2));
		}	
	}
}