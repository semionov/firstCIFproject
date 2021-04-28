package one;

import java.util.Random;

public class EmailManagment {

	private static String user = "";
	private static String email = "";
	private static String password = "";
	
	
	public static void createAccount(String word) {
		// scope #26
		// testRandom();
		
		user = createUser(word);
		email = createEmail(word);
		password = createPassword();
		printUserAccount();
	}

	public static void testRandom() {
		// scope #27
		String password = "_";

		int count = 0;
		while (count < 5) {
			int i = createIntRandom(10000);
			char j = createCharRandom();

			password = password + i + j;

			System.out.println(password);
			count++;

		}

		System.out.println(createIntRandom(1500));
		System.out.println(createCharRandom());
		System.out.println(createIntRandom(200));
		System.out.println(createCharRandom());

	}

	public static String createUser(String word) {
		// scope #28
		String[] nameSurename = word.split(" ");
		
		return nameSurename[0];
	}

	public static String createEmail(String word) {
		// scope #29
		// to-do
		return Editing.subEditingMy(word);
		//return word;
	}

	public static String createPassword() {
		// scope #30
		// to-do
		String password = "";

		for (int i = 0; i < 8; i++) {
			password = password + createCharRandom();
		}
		return password;
	}

	public static void printUserAccount() {
		// scope #31
		// to-do
		
		System.out.println("Email: " +
		email + "\n" +
				"User: " + user + "\n" +
		"Password: " + password + "\n");
		
	}

	public static int createIntRandom(int top) {
		// scope #32
		Random rand = new Random();

		// Generate random integers in range 0 to top, if top=10 random 0 to 9
		int intRandom = rand.nextInt(top);
		return intRandom;

	}

	public static char createCharRandom() {
		// scope #33
		// Random rand = new Random();
		String alphabetChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		// String alphabetChars2 = "!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/";

		// Generate random char in range 0 to top, if top=10 random 0 to 9

		char charRandom = alphabetChars.charAt(createIntRandom(alphabetChars.length()));

		return charRandom;

	}
}
