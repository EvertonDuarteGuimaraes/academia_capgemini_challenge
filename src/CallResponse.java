import java.util.ArrayList;
import java.util.Collections;

public class CallResponse {
	public Median doMedianOf;
	public DifferenceBetween doMatchsOf = new DifferenceBetween();
	public EncriptText doEncriptOf = new EncriptText();
	
	public int callMedian(ArrayList<Integer> inputList) {
		Collections.sort(inputList);
		doMedianOf = new Median(inputList);
		return doMedianOf.calc();
	}
	
	public int calldifferencesMatchs(ArrayList<Integer> inputList, int diferece) {
		return doMatchsOf.calc(inputList, diferece);
	}
	
	public String callEncript(String textToEncript) {
		return doEncriptOf.calc(textToEncript);
	}
}