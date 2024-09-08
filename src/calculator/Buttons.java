package calculator;

import javax.swing.*;
import java.awt.event.ActionListener;

public class Buttons {
    private JPanel body;
    private ActionListener actionListener;

    public Buttons(JPanel body, ActionListener actionListener) {
        this.body = body;
        this.actionListener = actionListener;
    }

    public void addFirstLineButtons() {
        addButton(String.valueOf(Operation.MOD.getOperChar()));
        addButton("Backs");
        addButton("C");
        addButton(String.valueOf(Operation.DIVISION.getOperChar()));
    }

    public void addSecondLineButtons() {
        addNumButtons(7, 9);
        addButton(String.valueOf(Operation.MULTIPLY.getOperChar()));
    }

    public void addThirdLineButtons() {
        addNumButtons(4, 6);
        addButton(String.valueOf(Operation.MINUS.getOperChar()));
    }

    public void addFourthLineButtons() {
        addNumButtons(1, 3);
        addButton(String.valueOf(Operation.PLUS.getOperChar()));
    }

    public void addFifthLineButtons() {
        addButton("^2");
        addNumButtons(0, 0);
        addButton(".");
        addButton("=");
    }

    private void addButton(String title) {
        JButton button = new JButton(title);
        button.addActionListener(actionListener);
        body.add(button);
    }

    private void addNumButtons(int min, int max) {
        for (int i = min; i <= max; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(actionListener);
            body.add(btn);
        }
    }
}
