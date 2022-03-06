import java.util.Collections;

public class CallResponse extends Automatic {
	public void questionOne() {
		listForQuestionOne();
		
		System.out.print("Dada uma lista [9, 2, 1, 4, 6] " );
		System.out.println(" , se ordenarmos teremos a mediana: " + doMedianOfTheExampleList.calc());
	}
	
	public void questionTwo() {
		System.out.print("Dada uma lista [1, 5, 3, 4, 2]" );
		System.out.println(", teremos: " + listForQuestionTwo() + " pares de diferença");
	}
	
	public void questionThree () {
		System.out.println("Dado o texto \"tenha um bom dia\", temos sua criptografia: " + textForQuestionThree());
	}
}