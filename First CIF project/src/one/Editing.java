package one;

public class Editing {

	public static void subEditing (String wordtoEdit) {
		// scope #24
		Operations.print("Substring from 3: ");
		Operations.print(wordtoEdit.substring(3));
		Operations.linebreak();
		
		Operations.print("Substring from 3 to 6: ");
		Operations.print(wordtoEdit.substring(3, 6));
		Operations.linebreak();
		
		Operations.print("Position @: ");
		Operations.print(wordtoEdit.indexOf("@"));
		Operations.linebreak();
		
		Operations.print("Domain: ");
		Operations.print(wordtoEdit.substring(wordtoEdit.indexOf("@"), wordtoEdit.length()));
		Operations.linebreak();
		
		Operations.print("User: ");
		Operations.print(wordtoEdit.substring(0,wordtoEdit.indexOf("@")));
		Operations.linebreak();
		
		Operations.print("New email: ");
		Operations.print(wordtoEdit.substring(0,wordtoEdit.indexOf("@")) + "@" +  "java.com");
		Operations.linebreak();
	}
	
	
	public static String subEditingMy (String wordToEdit) {
		
		String[] apellidos = wordToEdit.split(" ");
		
		return wordToEdit.charAt(0) + apellidos[1].toLowerCase() + "@java.com";
	}
	
}
