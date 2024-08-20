package lesson9.task2;

/**
 * @author Buyevich_I
 */
public class Rectangle extends AFigure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getP() {
        return (2 * this.a) + (2 * this.b);
    }

    @Override
    public double getS() {
        return this.a * this.b;
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.a, this.b);
    }
}
