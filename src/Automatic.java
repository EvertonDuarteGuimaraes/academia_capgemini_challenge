import java.util.ArrayList;
import java.util.Collections;

public class Automatic {
	public ArrayList<Integer> exampleList = new ArrayList<>();
	public ArrayList<Integer> newList = new ArrayList<>();
	public Median doMedianOfTheExampleList;
	public SpaceBetween doMatchsOfTheExampleList = new SpaceBetween();
	public EncriptText doEncriptOf;
	
	public void listForQuestionOne() {
		this.exampleList.clear();
		Collections.addAll(this.exampleList, 9, 2, 1, 4, 6);
		doMedianOfTheExampleList = new Median(this.exampleList);
	}
	
	public void listForQuestionOne(String inputList) {
		this.newList.clear();
		for (int i = 0; i < inputList.length(); i++) {
			this.newList.add(Integer.parseInt(inputList.substring(i, i+1)));
		}
		doMedianOfTheExampleList = new Median(this.newList);
	}
	
	public int listForQuestionTwo() {
		this.exampleList.clear();
		Collections.addAll(this.exampleList, 1, 5, 3, 4, 2);
		return doMatchsOfTheExampleList.calcManyDiferecs(this.exampleList, 2);
	}
	
	public int listForQuestionTwo(String inputList, String difereceBetween) {
		this.newList.clear();
		for (int i = 0; i < inputList.length(); i++) {
			this.newList.add(Integer.parseInt(inputList.substring(i, i+1)));
		}
		return doMatchsOfTheExampleList.calcManyDiferecs(this.newList, Integer.parseInt(difereceBetween));
	}
	
	public String textForQuestionThree() {
		doEncriptOf = new EncriptText("tenha um bom dia");
		doEncriptOf.breakTheText();
		return doEncriptOf.showEncript();
	}
}