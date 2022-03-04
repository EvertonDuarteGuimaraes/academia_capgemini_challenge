import java.util.Collections;

public class CallResponse extends Automatic  {
	public void questionOne(int numberOfTestes) {
		for(int i = 0; i < numberOfTestes; i++) {
			System.out.print("Dada uma lista " + this.randomValues(i));
			System.out.println(" , se ordenarmos teremos a mediana: " + this.calcMedian(this.randomValues(i)) + "\n");
		}
	}
}