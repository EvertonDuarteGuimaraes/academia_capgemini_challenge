import java.util.ArrayList;
import java.util.Collections;

public class CallResponse {
	public Median doMedianOfTheExampleList;
	public DiferenceBetween doMatchsOfTheExampleList = new DiferenceBetween();
	public EncriptText doEncriptOf = new EncriptText();
	
	public int call(ArrayList<Integer> inputList) {
		Collections.sort(inputList);
		doMedianOfTheExampleList = new Median(inputList);
		return doMedianOfTheExampleList.calc();
	}
	
	public int call(ArrayList<Integer> inputList, int diferece) {
		return doMatchsOfTheExampleList.calc(inputList, diferece);
	}
	
	public String call(String textToEncript) {
		return doEncriptOf.calc(textToEncript);
	}
}