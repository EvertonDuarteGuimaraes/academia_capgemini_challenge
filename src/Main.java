import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		CallResponse responseTo = new CallResponse();
		
		ArrayList<Integer> questionOneList = new ArrayList<>(); 
		Collections.addAll(questionOneList, 9, 2, 1, 4, 6);
		
		ArrayList<Integer> questionTwoList = new ArrayList<>(); 
		Collections.addAll(questionTwoList, 1, 5, 3, 4, 2);
		int questionTwoDiferece = 2;
		
		String questionThreeText = "tenha um bom dia";
		
		System.out.println("Saída da primeira questão: " + responseTo.callMedian(questionOneList));
		System.out.println("Saída da segunda questão: " + responseTo.callDifferences(questionTwoList, questionTwoDiferece));
		System.out.println("Saída da terceira questão: " + responseTo.callEncript(questionThreeText));
	}
}