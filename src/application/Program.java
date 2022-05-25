package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Contribuitor;
import entities.Individual;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Contribuitor> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			if (ch == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double annualIncome = sc.nextDouble();
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpenditures));
			} else {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual income: ");
				double annualIncome = sc.nextDouble();
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, annualIncome, employees));
			}
		}

		System.out.println();
		System.out.println("TAXES PAID:");
		double sum = 0;
		for (Contribuitor c : list) {
			System.out.println(c);
			sum += c.tax();
		}
		System.out.println();
		System.out.printf("TOTAL TAXES: $ %.2f", sum);

		sc.close();
	}
}
