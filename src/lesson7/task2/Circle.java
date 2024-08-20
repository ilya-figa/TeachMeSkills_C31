package lesson7.task2;

/**
 * @author Buyevich_I
 */
public class Circle extends AFigure {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getP() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public double getS() {
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public Circle clone() {
        return new Circle(this.r);
    }
}
