import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Automatic {
	public ArrayList<Integer> exampleList = new ArrayList<>();
	public Median doMedianOfTheExampleList;
	public SpaceBetween doMatchsOfTheExampleList = new SpaceBetween();
	public EncriptText doEncriptOf;
	
	public void listForQuestionOne() {		 
		Collections.addAll(this.exampleList, 9, 2, 1, 4, 6);
		doMedianOfTheExampleList = new Median(exampleList);
	}
	
	public int listForQuestionTwo() {
		Collections.addAll(this.exampleList, 1, 5, 3, 4, 2);
		return doMatchsOfTheExampleList.calcManyDiferecs(this.exampleList, 2);
	}
	
	public String textForQuestionThree() {
		doEncriptOf = new EncriptText("tenha um bom dia");
		doEncriptOf.breakTheText();
		return doEncriptOf.showEncript();
	}
}