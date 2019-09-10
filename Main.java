/*Prints the menu for the user
Provides the user with a method t select the option
All methods for the provided options must be defined
i.e. create account, deposit into account, withdraw from account (remember you cannot withdraw from savings),
pay interest to the respective accounts, close account, Quit the system
Also note that for any withdraw the user must select which account they want to withdraw from if they have multiple accounts;
the create account method must allow the user to select which account they are opening r creating --
All account object must be stored into an array.
*/

import java.util.Scanner;

public class Main{
	private static int choice;
	private static String firstName;
	private static String lastName;
	private static int idNO;
	private static double amountToWithdraw;
	private static double amountToDeposit;
	private static int pin;
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//Accounts acc = new Accounts();

		createAccount();
		//deposit();
		withdraw();
		closeAccount();

	}

	private static void createAccount(){
		//Scanner sc = new Scanner(System.in);
		System.out.println(1+" open a checkAccount\n" + 2 +" open a savings account\n"
		+ 3 + " open an interestBearingAccount\n" + 4 + " Quit");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("opening a check account");
				System.out.println("Enter your first name: ");
				firstName = sc.next();
				System.out.println("Enter your last name: ");
				lastName = sc.next();
				System.out.println("Enter your idNO: ");
				idNO = sc.nextInt();
				System.out.println("Account successfully created");
				break;
			case 2:
				System.out.println("opening a savings account");
				System.out.println("Enter your first name: ");
				firstName = sc.next();
				System.out.println("Enter your last name: ");
				lastName = sc.next();
				System.out.println("Enter your idNO: ");
				idNO = sc.nextInt();
				System.out.println("Account successfully created!!");
				break;
			case 3:
				System.out.println("opening an interest bearing account");
				System.out.println("Enter your first name: ");
				firstName = sc.next();
				System.out.println("Enter your last name: ");
				lastName = sc.next();
				System.out.println("Enter your idNO: ");
				idNO = sc.nextInt();
				System.out.println("Account successfully created!!");
				break;
			default:
				System.out.println("Cancelling...!");
				break;
		}
	}

	
	private static void deposit(){
		System.out.println("Make a deposit");
		int choice = sc.nextInt();
		switch(choice){
			case 1:
				System.out.println("deposit into your check account");
				//pin = Math.random();
				System.out.println("enter an amount to deposit");
				if (amountToDeposit > 5000) {
					System.out.println("enter an amount less than 5000");
				}else{
					amountToDeposit = sc.nextInt();
				}
				break;
			case 2:
				System.out.println("deposit into your savings account");
				System.out.psrintln("enter an amount to deposit: ");
				if (amountToDeposit > 5000) {
					System.out.println("enter an amount less than 5000");
				}else{
					amountToDeposit = sc.nextInt();
				}
				break;
			case 3:
				System.out.println("deposit into your interest bearing account");
				System.out.println("enter an amount to deposit");
				if (amountToDeposit > 5000) {
					System.out.println("enter an amount less than 5000");
				}else{
					amountToDeposit = sc.nextInt();
				}
				break;
			default:
				System.out.println("cancel");
				break;
		}
	}
	private static void withdraw(){
		System.out.println("make a withdrawal");
		int choice = sc.nextInt();
		if(choice==2){
			System.out.println("you cant withdraw from this account");
		}else{
			switch(choice){
				case 1:
 					System.out.println("maximum withdrawal p5000");
					if (amountToWithdraw > 5000) {
						System.out.println("enter any amount that is not more than p5000");
					}else{
						amountToWithdraw = sc.nextInt();
					}
				break;
				case 2:
					System.out.println("maximum withdrawal per day: p5000");
					if (amountToWithdraw > 5000) {
						System.out.println("enter any amount that is not more than p5000 ");
					}else{
						amountToWithdraw = sc.nextInt();
					}
					break;
				default:
					System.out.println("you have no money to withdraw");
					break;
		 	}
		}
	}

	private static void closeAccount(){
		int choice = sc.nextInt();
		System.out.println("select an account to close: ");
		System.out.println(1+" checkAccount\n" + 2 +" savings account\n"
		+ 3 + " interestBearingAccount\n" + 4 + " cancel");
		switch(choice){
			case 1:
				System.out.println("you are about to close your checkAccount..proceed??");
				break;
			case 2:
				System.out.println("you are about to close your savings Account ..proceed??");
				break;
			case 3:
				System.out.println("you are about to close your interestBearing account..proceed??");
				break;
			case 4:
				System.out.println("cancel");
				break;
		}
	}

	private static void quit(){
		System.out.println("returning to main menu...");
		System.out.println(4);
	}
}
