package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JTextField textField;

    public Calculator(){
        super("Calculator Swing");

        setLayout(new BorderLayout());

        add(setTop(), BorderLayout.NORTH);
        add(setBody(), BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 500);
        setResizable(false);
        setVisible(true);
    }

    private JPanel setTop(){
        JPanel top = new JPanel();
        textField = new JTextField("0");
        textField.setEditable(false);

        top.setLayout(new BorderLayout());
        top.add(textField, BorderLayout.CENTER);

        return top;
    }

    private JPanel setBody(){
        JPanel body = new JPanel();
        body.setLayout(new GridLayout(5, 4));

        ActionListener actionListener = new ActionListenerClass(textField);

        Buttons buttons = new Buttons(body, actionListener);

        buttons.addFirstLineButtons();
        buttons.addSecondLineButtons();
        buttons.addThirdLineButtons();
        buttons.addFourthLineButtons();
        buttons.addFifthLineButtons();

        return body;
    }
}
