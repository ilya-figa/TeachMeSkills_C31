import lesson7.task1.*;
import lesson7.task2.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        /*
        Задача 1:
        Создать классы "Директор", "Рабочий", "Бухгалтер". Реализовать интерфейс с методом,
        который печатает название должности и имплементировать этот метод в созданные
        классы.
        */
        IWorker[] workers = new IWorker[]{new Worker(), new Director(), new Accountant()};
        for (IWorker worker : workers) {
            System.out.println(worker.getJobTitle());
        }
        System.out.println("--------------------------------------");
        /*
        Задача 2:
        Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг. Реализовать
        функцию подсчета площади для каждого типа фигуры и подсчет периметра(используя
        абстрактный класс/методы). Создать массив из 5 разных фигур. Вывести на экран сумму
        периметра всех фигур в массиве.
        */
        AFigure[] figures = new AFigure[]{
                new Triangle(2, 2, 3),
                new Rectangle(1, 2),
                new Circle(3),
                new Rectangle(2, 3),
                new Triangle(3, 2, 4)};

        double sumP = 0;
        for (AFigure figure : figures) {
            System.out.println(" P = " + figure.getP() + " S = " + figure.getS());
            sumP += figure.getP();
        }
        System.out.println(" Sum P = " + sumP);

        System.out.println("--------------------------------------");
        /*
        Задача *:
        Самостоятельно изучить и показать пример работы интерфейса-маркера Cloneable.
        */

        AFigure rectangle = new Rectangle(1, 2);
        AFigure rectangle1 = rectangle;
        //A good example that if you create without new, it will not be a copy.
        if (rectangle == rectangle1) {
            System.out.println("rectangle == rectangle1");
        }
        if (rectangle.equals(rectangle1)) {
            System.out.println("rectangle.equals(rectangle1)");
        }
        try {
            /*If we use the Cloneable interface, then we can overwrite the clone method,
            and these two objects will be different, not related to each other.*/
            AFigure rectangleCopy = rectangle.clone();
            if (rectangleCopy == rectangle) {
                System.out.println("figure == rectangle");
            }
            if (rectangleCopy.equals(rectangle)) {
                System.out.println("figure.equals(rectangle)");
            }
        } catch (CloneNotSupportedException exception) {
            throw new CloneNotSupportedException();
        }
    }
}