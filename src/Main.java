import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		CallResponse responseFor = new CallResponse();
		
		ArrayList<Integer> questionOne = new ArrayList<>(); Collections.addAll(questionOne, 9, 2, 1, 4, 6);
		ArrayList<Integer> questionTwo = new ArrayList<>(); Collections.addAll(questionTwo, 1, 5, 3, 4, 2);
		String questionThree = "Olá mundo";
		
		System.out.println("Saida da primeira questão: " + responseFor.call(questionOne));
		System.out.println("Saida da segunda questão: " + responseFor.call(questionTwo, 2));
		System.out.println("Saida da terceira questão: " + responseFor.call(questionThree));
	}
}