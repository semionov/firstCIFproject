package one;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//hi
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Tell me your user name:");
		String userName = reader.nextLine();
		
		System.out.println("Tell me your type of user:");
		String userType = reader.nextLine();
		
		System.out.println("Tell me the amount of your buy:");
		int userBuy = reader.nextInt();
		
		System.out.println("User/n");
		System.out.println("-----------------------");
		System.out.println("User name: " + userName);
		System.out.println("User Type: " + userType);
		System.out.println(":");
		
	
	}

}

