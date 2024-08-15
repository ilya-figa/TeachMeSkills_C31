package Lesson_6;

/**
 *
 * @author Buyevich_I
 */
public class ATM {
    private int[][] matrixBanknotes;

    public ATM(int countBanknote20, int countBanknote50, int countBanknote100) {
        this.matrixBanknotes = new int[][]{{20, countBanknote20}, {50, countBanknote50}, {100, countBanknote100}};
    }

    public boolean addMoney(int money) {
        int[][] tempMatrixBanknotes = new int[][]{{20, 0}, {50, 0}, {100, 0}};

        for (int i = tempMatrixBanknotes.length - 1; i >= 0; i--) {
            if (money / tempMatrixBanknotes[i][0] > 0) {
                tempMatrixBanknotes[i][1] += money / tempMatrixBanknotes[i][0];
                money -= tempMatrixBanknotes[i][1] * tempMatrixBanknotes[i][0];
            }
        }

        if (money == 0) {
            for (int i = 0; i < tempMatrixBanknotes.length; i++) {
                this.matrixBanknotes[i][1] += tempMatrixBanknotes[i][1];
            }
            printWithdrawnMoney(Operation.ADD, tempMatrixBanknotes);
            return true;
        }
        return false;
    }

    public boolean withdrawMoney(int money) {
        int[][] tempMatrixBanknotes = new int[][]{{20, 0}, {50, 0}, {100, 0}};

        for (int i = this.matrixBanknotes.length - 1; i >= 0; i--) {
            if (this.matrixBanknotes[i][1] > 0 && money / this.matrixBanknotes[i][0] > 0) {
                int countBanknote = money / this.matrixBanknotes[i][0];
                if (countBanknote > this.matrixBanknotes[i][1]) {
                    countBanknote = this.matrixBanknotes[i][1];
                }

                tempMatrixBanknotes[i][1] += countBanknote;
                money -= countBanknote * this.matrixBanknotes[i][0];
            }
        }

        if (money == 0) {
            for (int i = 0; i < tempMatrixBanknotes.length; i++) {
                this.matrixBanknotes[i][1] -= tempMatrixBanknotes[i][1];
            }
            printWithdrawnMoney(Operation.WITHDRAW, tempMatrixBanknotes);
            return true;
        }
        return false;
    }

    private void printWithdrawnMoney(Operation operation, int[][] matrixBanknotes) {
        for (int[] matrixBanknote : matrixBanknotes) {
            if (matrixBanknote[1] != 0) {
                System.out.println(operation.getText() + " " + matrixBanknote[0] + " denomination banknotes = " + matrixBanknote[1]);
            }
        }
    }
}
