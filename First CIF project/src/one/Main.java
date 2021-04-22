package one;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);

		while (true) {

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
			System.out.println("User Buy: " + userBuy);

			if (userType.equals("vip")) {

				System.out.println("\nTicket:");
				System.out.println("-------------------------\n");
				System.out.println(userName + " is a vip user\n");
				System.out.println("The amount of your buy is: " + userBuy);
				System.out.println("Your discount is: " + "25%");
				System.out.println("Your total discout is: " + (userBuy * 25 / 100));
				System.out.println("Your should pay (with the discount): " + (userBuy - (userBuy * 25 / 100)) + "\n");
				
			} else if(userType.equals("regular")){
				
				System.out.println("\nTicket:");
				System.out.println("-------------------------\n");
				System.out.println(userName + " is a regular user\n");
				System.out.println("The amount of your buy is: " + userBuy);
				System.out.println("Your discount is: " + "25%");
				System.out.println("Your total discout is: " + (userBuy * 15 / 100));
				System.out.println("Your should pay (with the discount): " + (userBuy - (userBuy * 15 / 100)) + "\n");
				
			} else {
				System.out.println("\nTicket:");
				System.out.println("-------------------------\n");
				System.out.println(userName + " is NOT a vip NOR regular user\n");
				System.out.println("The amount of your buy is: " + userBuy);
				System.out.println("Your discount is: " + "0%");
				System.out.println("Your total discout is: " + "0");
				System.out.println("Your should pay (with the discount): " + userBuy + "\n");
			}
		}

		// bla bla
	}

}
