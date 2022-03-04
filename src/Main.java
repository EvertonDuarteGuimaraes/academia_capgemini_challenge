import java.util.Random;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		OptionsMenu start = new OptionsMenu();
		//start.options();
		
		ArrayList<Integer> l = new ArrayList<>();
		
		l.add(1);
		l.add(5);
		l.add(3);
		l.add(4);
		l.add(2);
		
		SpaceBetween a = new SpaceBetween();
		
		
		System.out.println(a.calcManyDiferecs(l, 4));
	}
}