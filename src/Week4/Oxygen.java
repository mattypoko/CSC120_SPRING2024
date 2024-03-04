package Week4;

import java.util.Scanner;

public class Oxygen {
    // Constant variables
    private static Scanner scnr = new Scanner(System.in);
    private static final int FEET_PER_ATMOSPHERE = 33;
    private static final double MAX_PARTIAL_PRESSURE = 1.4;
    private static final double CON_PARTIAL_PRESSURE = 1.6;

    public static void main(String[] args) {

        // Variables to hold system values
        double ambient_pressure, partial_pressure;
        char oxygen_pressure_group;
        int depth, percentage;

        // Get depth and percentage from user input
        System.out.print("Enter depth: ");
        depth = scnr.nextInt();
        System.out.print("Enter percentage: ");
        percentage = scnr.nextInt();

        // Calculate ambient pressure, partial pressure, and the oxygen pressure group
        ambient_pressure = (double)depth / FEET_PER_ATMOSPHERE + 1;
        partial_pressure = (double)percentage / 100 * ambient_pressure;
        oxygen_pressure_group = (char)((int)(partial_pressure * 10) + (int)'A');

        // Print calculations to user, and compares partial pressure to maximal and contingency
        System.out.println("Ambient pressure: " + ambient_pressure);
        System.out.println("O2 pressure: " + partial_pressure);
        System.out.println("O2 group: " + oxygen_pressure_group);
        System.out.println("Exceeds maximal O2 pressure: " + (partial_pressure > MAX_PARTIAL_PRESSURE));
        System.out.println("Exceeds contingency O2 pressure: " + (partial_pressure > CON_PARTIAL_PRESSURE));
    }
}