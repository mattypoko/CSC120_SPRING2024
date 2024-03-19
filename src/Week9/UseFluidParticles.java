package Week9;
import java.util.Scanner;

public class UseFluidParticles {
    private static final Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {

        int particleTagId;
        double positionX, positionY;

        //----Get particle tag id
        System.out.print("Particle tag id: ");
        particleTagId = keyboard.nextInt();

        //----Create object
        FluidParticle aFluidParticle = new FluidParticle(particleTagId);

        //----Move particle once
        System.out.println(aFluidParticle);
        System.out.print("Enter x movement: ");
        positionX = keyboard.nextDouble();
        System.out.print("Enter y movement: ");
        positionY = keyboard.nextDouble();
        aFluidParticle.moveParticle(positionX, positionY);

        //----Move particle ... again!
        System.out.println(aFluidParticle);
        System.out.print("Enter x movement: ");
        positionX = keyboard.nextDouble();
        System.out.print("Enter y movement: ");
        positionY = keyboard.nextDouble();
        aFluidParticle.moveParticle(positionX, positionY);

        //----Print out particle's position one last time.
        System.out.println(aFluidParticle);
    }
}