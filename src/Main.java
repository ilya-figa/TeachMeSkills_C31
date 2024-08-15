import Lesson_6.ATM;
import Lesson_6.CreditCard;

public class Main {
    public static void main(String[] args) {
        CreditCard firstCreditCard = new CreditCard("CreditCard number 1", 100);
        CreditCard secondCreditCard = new CreditCard("CreditCard number 2", 1);
        CreditCard thirdCreditCard = new CreditCard("CreditCard number 3", 0);

        firstCreditCard.addMoney(100);
        secondCreditCard.addMoney(1);
        thirdCreditCard.subtractMoney(100);

        firstCreditCard.printInfoCard();
        secondCreditCard.printInfoCard();
        thirdCreditCard.printInfoCard();

        System.out.println("----------------------------------------------");

        ATM atm = new ATM(1,1,1);
        System.out.println(atm.withdrawMoney(100));
        System.out.println(atm.withdrawMoney(60));
        System.out.println(atm.withdrawMoney(70));
        System.out.println(atm.addMoney(100));
        System.out.println(atm.withdrawMoney(70));
        System.out.println(atm.addMoney(70));
        System.out.println(atm.addMoney(60));

    }
}