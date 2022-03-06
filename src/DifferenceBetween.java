import java.util.ArrayList;

public class DifferenceBetween {
	public int calc(ArrayList<Integer> listOfNumbers, int diference) {
		int caunter = 0;
		for(int i = 0; i < listOfNumbers.size(); i++ ) {
			if(listOfNumbers.contains(listOfNumbers.get(i) - diference)) {
				caunter++;
			}
		}
		return caunter;
	}
}