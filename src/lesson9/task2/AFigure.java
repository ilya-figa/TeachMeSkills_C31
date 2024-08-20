package lesson9.task2;

/**
 * @author Buyevich_I
 */
public abstract class AFigure implements Cloneable{
    public abstract double getP();
    public abstract double getS();

    @Override
    public AFigure clone() throws CloneNotSupportedException {
        return (AFigure) super.clone();
    }
}
