import java.util.ArrayList;
import java.util.Random;

public class Automatic extends Median{
	public ArrayList randomValues(int seed) {
		ArrayList<Integer> values = new ArrayList<>();
		Random doSize = new Random(seed + 10);
		Random doValue = new Random(seed + 20);
		
		int listSize = doSize.nextInt(6) + 5;
		for(int newValue = 0; newValue < listSize; newValue++) {
			values.add(doValue.nextInt(10) + 1);
		}
		
		return values;
	}
}