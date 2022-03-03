import java.util.ArrayList;
import java.util.Collections;

public class MathSheet {
	private  ArrayList<Integer> numbers = new ArrayList<Integer>();
	
	public void setNumber(Integer number) {
		numbers.add(number);
	}
	
	public ArrayList getList() {
		return numbers;
	}
	
	public Integer getNumber(Integer position) {
		return numbers.get(position);
	}
	
	public Integer calcMedian() {
		Collections.sort(numbers);
		int size =  getList().size();
		if(size % 2 == 0) {
			return (getNumber(size / 2 - 1) + getNumber(size / 2)) / 2;
		} else {
			return getNumber(size / 2);
		}
	}
}
