package Week9;

public class FluidParticle {
    private int particleTag;
    private double posX, posY;
    public FluidParticle(int particleTag) {
        this.particleTag = particleTag;
        posX = 0.0;
        posY = 0.0;
    }
    public String toString() {
        return "Particle " + particleTag + " is at (" + posX + ", " + posY + ")";
    }
    public void moveParticle(double moveX, double moveY) {
        posX += moveX;
        posY += moveY;
    }
}