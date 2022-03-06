import java.util.ArrayList;

public class EncriptText {
	public String textWithoutSpaces;
	public ArrayList<Character> characterList = new ArrayList<>();
	public String EncriptedText = "";
	
	public EncriptText(String textToEncript) {
		this.textWithoutSpaces = textToEncript.replaceAll("\\s+","");
	}
	
	public void breakTheText() {
		char[] textBreaked = this.textWithoutSpaces.toCharArray();
		for(int i  = 0; i < Math.round(Math.sqrt(textBreaked.length)); i++) {
			for(int j = i; j < textBreaked.length; j+= Math.round(Math.sqrt(textBreaked.length))) {
				if(j >= textBreaked.length) {
					break;
				} else {
					characterList.add(textBreaked[j]);
				}
			}
			characterList.add(' ');
		}
	}
	
	public String showEncript() {
		for(int i = 0; i < this.characterList.size(); i++) {
			this.EncriptedText += characterList.get(i);
		}
		return this.EncriptedText;
	}
}