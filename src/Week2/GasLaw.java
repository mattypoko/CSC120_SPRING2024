package Week2;
import java.util.Scanner;

public class GasLaw {
    private static Scanner keyboard = new Scanner(System.in);
    private static final double GAS_CONSTANT = 8.3143;
    public static void main(String[] args) {
// Variables to hold system values
        double volume, moles, temperature;
        double pressure;

// Getting 3 input data from keyboard/user
        System.out.print("Enter volume, moles, temperature : ");
        volume = keyboard.nextDouble();
        moles = keyboard.nextDouble();
        temperature = keyboard.nextDouble();

// Calculate pressure
        pressure = moles * GAS_CONSTANT * temperature / volume;

// Output the result to the screen
        System.out.println("Pressure is " + pressure);
    }
}