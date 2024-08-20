package lesson7.task2;

/**
 * @author Buyevich_I
 */
public class Triangle extends AFigure {
    private double a;
    private double b;
    private double c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getP() {
        return this.a + this.b + this.c;
    }

    @Override
    public double getS() {
        double p = this.getP() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public Triangle clone() {
        return new Triangle(this.a, this.b, this.c);
    }
}
