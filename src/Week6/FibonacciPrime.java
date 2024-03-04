package Week6;

import java.util.Scanner;

public class FibonacciPrime {
    private static Scanner scnr = new Scanner(System.in);
    // Constants for max number in array and the stop value for user input.
    private static final int MAX_NUMBER = 10;
    private static final int STOP_INPUT_VALUE = 0;
    public static int[] array = new int[MAX_NUMBER];

    public static void main(String[] args) {
        System.out.println("WEEK 6 - LAB 5");
        int num_of_values = enterNumbers();
        System.out.println(" ");

        // Prints out the statements for whether each number is Fibonacci or prime.
        for (int index2 = 0; index2 < num_of_values - 1; index2++) {
            if (isFibonacci(array[index2])) {
                System.out.print(array[index2] + " is Fibonacci ");
            } else {
                System.out.print(array[index2] + " is not Fibonacci ");
            }
            if (isPrime(array[index2])) {
                System.out.println("and is prime.");
            } else {
                System.out.println("and is not prime.");
            }
        }
    }

    public static int enterNumbers() {
        // Asks user for numbers, putting them into the array until the user enters 0.
        int value;
        int num_of_values = 0;

        do {
            System.out.print("Enter any integer (0 to stop): ");
            value = scnr.nextInt();
            array[num_of_values] = value;
            num_of_values += 1;
        } while ((value != STOP_INPUT_VALUE) && (num_of_values < 10));

        return num_of_values;
    } // End of enterNumbers method.

    // Checks whether the number is Fibonacci and returns true or false.
    public static boolean isFibonacci(int value) {
        int current = 0, previous = 1;
        while (current <= value) {
            if (current == value) {
                return true;
            }
            int next = previous + current;
            current = previous;
            previous = next;
        }
        return false;
    } // End of isFibonacci method.

    // Checks whether the number is prime and returns true or false.
    public static boolean isPrime(int value) {
        for (int index = 2; index < value; index++) {
            if ((value % index) == 0) {
                return false;
            }
        }
        return true;
    } // End of isPrime method.
}