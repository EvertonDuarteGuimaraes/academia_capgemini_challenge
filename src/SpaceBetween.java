import java.util.ArrayList;

public class SpaceBetween {
	public int calcManyDiferecs(ArrayList<Integer> listOfNumbers, int space) {
		int caunter = 0;
		for(int i = 0; i < listOfNumbers.size(); i++ ) {
			if(listOfNumbers.contains(listOfNumbers.get(i) - space)) {
				caunter++;
			}
		}
		return caunter;
	}
}