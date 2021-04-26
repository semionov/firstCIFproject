package one;

public class Editing {

	
	public static String subEditing (String wordToEdit) {
		
		String[] apellidos = wordToEdit.split(" ");
		
		return wordToEdit.charAt(0) + apellidos[1].toLowerCase() + "@java.com";
		
	}
}
