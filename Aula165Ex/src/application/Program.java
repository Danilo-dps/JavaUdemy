package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayers;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayers> list = new ArrayList<>();
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char x = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			Double annualIncome = sc.nextDouble();
			
			if(x == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, annualIncome, numberOfEmployees));
			}
		}
		
		double sum = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayers a : list) {
			double tax = a.tax();
			System.out.println(a.toString());
			sum += tax;
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
	
		sc.close();
	}
}
