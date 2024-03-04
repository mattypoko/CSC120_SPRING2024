package Week5;

import java.util.Scanner;

public class Taxes {
    private static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {
        // Variables
        double value = 0.0, income = 0.0, deduction = 0.0;

        // Add values to either income or deduction until user inputs 0.
        do {
            System.out.print("Enter income or deduction: ");
            value = scnr.nextDouble();
            if (value > 0.0) {
                income += value;
            } else {
                deduction += value;
            }
        } while (value != 0.0);

        // More variables
        double taxable_income = calcTaxableIncome(income, deduction);
        char tax_group = calcTaxGroup(taxable_income);
        double tax_owed = calcTaxOwed(tax_group, taxable_income);

        // Print calculations to user.
        System.out.println("\nIncome = " + income);
        System.out.println("Deductions = " + deduction);
        System.out.println("Taxable income = " + taxable_income);
        System.out.println("Tax group = " + tax_group);
        System.out.println("Tax owed = " + tax_owed);
    }

    // Calculate taxable income from income/deduction difference.


    static double calcTaxableIncome(double income, double deduction) {
        double taxable_income = income - deduction;
        if (taxable_income < 0) {
            taxable_income = 0;
        }
        return taxable_income;
    }

    // Assign tax group character based on taxable income.
    static char calcTaxGroup(double taxable_income) {
        if (taxable_income >= 500000) {
            return 'S';
        } else if (taxable_income >= 200000) {
            return 'Q';
        } else if (taxable_income >= 100000) {
            return 'M';
        } else if (taxable_income >= 50000) {
            return 'A';
        } else if (taxable_income >= 20000) {
            return 'R';
        } else {
            return 'P';
        }
    }

    // Assign tax percentage based on tax group.
    static double calcTaxOwed(char tax_group, double taxable_income) {
        return switch (tax_group) {
            case 'S' -> taxable_income * 0.25;
            case 'Q' -> taxable_income * 0.25;
            case 'M' -> taxable_income * 0.10;
            case 'A' -> taxable_income * 0.03;
            case 'R' -> taxable_income * 0.03;
            case 'P' -> taxable_income * 0.00;
            default -> 0.0;
        };
    }
}