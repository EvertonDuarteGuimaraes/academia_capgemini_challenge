import java.util.Scanner;

public class OptionsMenu {
	
	public void options() {
		Scanner input = new Scanner(System.in);
		boolean maintain = true;
		CallResponse response = new CallResponse(); 
		
		while(maintain) {
			System.out.println("Escolha uma das questões do desafio, 1, 2 ou 3: ");
			
			switch(Integer.parseInt(input.nextLine())) {
			  case 1:
				System.out.println("Digite quantos testes quer verificar: ");
				int numberOfTestes = Integer.parseInt(input.nextLine());
				response.questionOne(numberOfTestes);
			    break;
			  case 2:
			    // code block
			    break;
			  case 3:
				    // code block
				    break;
			  default:
			    // code block
			}
		}
	}
}