import java.util.ArrayList;
import java.util.Collections;

public class CallResponse {
	public Median doMedianOf = new Median();
	public DifferenceBetween doMatchsOf = new DifferenceBetween();
	public EncriptText doEncriptOf = new EncriptText();
	
	public int callMedian(ArrayList<Integer> inputList) {
		Collections.sort(inputList);
		return doMedianOf.calc(inputList);
	}
	
	public int callDifferences(ArrayList<Integer> inputList, int diferece) {
		return doMatchsOf.calc(inputList, diferece);
	}
	
	public String callEncript(String textToEncript) {
		return doEncriptOf.calc(textToEncript);
	}
}