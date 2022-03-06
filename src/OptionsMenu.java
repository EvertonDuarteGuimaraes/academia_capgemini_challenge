import java.util.Scanner;

public class OptionsMenu {
	
	public void options() {
		Scanner input = new Scanner(System.in);
		boolean maintain = true;
		CallResponse response = new CallResponse(); 

		System.out.println("Escolha uma das questões do desafio, 1, 2 ou 3: ");
		
		switch(Integer.parseInt(input.nextLine())) {
		  case 1:
			response.questionOne();
			System.out.println("Insira um novo valor para representar uma lista, exemplo \"123\" para \"[1, 2, 3]\"");
			String newList = input.nextLine();
			response.questionOne(newList);
		    break;
		  case 2:
			response.questionTwo();
		    break;
		  case 3:
			response.questionThree();
			    break;
		  default:
			System.out.println("Escolha apenas 1, 2 ou 3.");
		    break;
		}
	}
}