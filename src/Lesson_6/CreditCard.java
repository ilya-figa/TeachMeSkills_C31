package Lesson_6;

/**
 *
 * @author Buyevich_I
 */
public class CreditCard {
    private String accountNumber;
    private int sumAccount;

    public CreditCard(String accountNumber, int sumAccount) {
        this.accountNumber = accountNumber;
        this.sumAccount = sumAccount;
    }

    public void subtractMoney(int money) {
        this.setSumAccount(this.sumAccount - money);
    }

    public void addMoney(int money) {
        this.setSumAccount(this.sumAccount + money);
    }

    public void printInfoCard() {
        System.out.println("Account number: " + getAccountNumber() + " sumAccount: " + getSumAccount());
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public int getSumAccount() {
        return sumAccount;
    }

    public void setSumAccount(int sumAccount) {
        if (sumAccount >= 0) {
            this.sumAccount = sumAccount;
        } else {
            this.sumAccount = 0;
            System.out.println("balance cannot be negative");
        }
    }
}
