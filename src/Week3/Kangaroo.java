package Week3;
import java.util.Scanner;
import java.lang.Math;

public class Kangaroo {
    private static Scanner scnr = new Scanner(System.in);
    private static final double ROADKILL_CONSTANT = 1.47;
    public static void main(String[] args) {
// Variables to hold system values
        double square_of_land_km, length_of_road_km, roo_density, road_surface_area;
        int num_of_roos, kills, injuries;

        System.out.print("Enter side of square in km: ");
        square_of_land_km = scnr.nextDouble();
        System.out.print("Enter roads length in km: ");
        length_of_road_km = scnr.nextDouble();
        System.out.print("Enter number of 'roos: ");
        num_of_roos = scnr.nextInt();

        roo_density = num_of_roos / (square_of_land_km * square_of_land_km);
        road_surface_area = 0.01 * length_of_road_km;
        kills = (int)(roo_density * road_surface_area * ROADKILL_CONSTANT);
        injuries = (int)(Math.ceil((roo_density * road_surface_area * ROADKILL_CONSTANT) % 1));

        System.out.println("Expected number of kills: " + kills);
        System.out.println("Expected number of injuries: " + injuries);
    }
}