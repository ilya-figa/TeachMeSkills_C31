import lesson13.Account;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 " + Account.registration("Ilya","Ilya123", "Ilya123"));

        System.out.println("2 " + Account.registration("Ilya11111111111111111111","Ilya123", "Ilya123"));
        System.out.println("3 " + Account.registration("Ilya asd","Ilya123", "Ilya123"));
        System.out.println("4 " + Account.registration("Ilya","Ilya 123", "Ilya 123"));
        System.out.println("5 " + Account.registration("Ilya","Ilya", "Ilya"));
        System.out.println("6 " + Account.registration("Ilya","Ilya123", "Ilya132"));
    }
}