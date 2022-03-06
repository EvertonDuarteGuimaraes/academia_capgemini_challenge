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
		    break;
		  case 2:
			response.questionTwo();
		    break;
		  case 3:
			    // code block
			    break;
		  default:
		    // code block
		}
	}
}