import java.util.Random;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		OptionsMenu start = new OptionsMenu();
		//start.options();
		
		EncriptText a = new EncriptText("tenha um bom dia");
		a.breakTheText();
		System.out.println(a.showEncript());
	}
}