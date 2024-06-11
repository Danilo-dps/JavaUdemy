package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.BusinessException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner nilo = new Scanner(System.in);
		
		try {
		System.out.println("Enter account data:");
		System.out.print("Number: ");
		Integer number = nilo.nextInt();
		System.out.print("Holder: ");
		String holder = nilo.next();
		System.out.print("Initial balance: ");
		Double balance = nilo.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = nilo.nextDouble();
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println();
		System.out.print("Enter amount for withdraw: ");
		acc.withdraw(nilo.nextDouble());
		
		System.out.printf("New balance: " + acc.getBalance());
		}
		catch (BusinessException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}

		nilo.close();
	}

}
