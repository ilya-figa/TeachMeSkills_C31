package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class ActionListenerClass implements ActionListener {
    private JTextField textField;
    private List<Operation> operationsList = Arrays.asList(Operation.values());

    public ActionListenerClass(JTextField textField){
        this.textField = textField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        String operation = btn.getText();
        StringBuilder stringBuilder = new StringBuilder(textField.getText());
        switch (operation){
            case "Backs":
                if(!stringBuilder.isEmpty()) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                }
                break;
            case "C":
                stringBuilder = new StringBuilder();
                break;
            case "=":
                stringBuilder = new StringBuilder(calculation(stringBuilder));
                break;
            case "^2":
                stringBuilder = new StringBuilder(String.valueOf(Math.pow(Double.parseDouble(stringBuilder.toString()),2)));
                //stringBuilder = new StringBuilder(calculation(stringBuilder));
                break;

            default:
                stringBuilder.append(btn.getText());
                break;
        }
        textField.setText(stringBuilder.toString());
    }

    private String calculation(StringBuilder example){
        try {
            Double leftNumber = null, rightNumber = null;
            Operation executionOperation= null;
            for(int i = 1; i < example.length(); i++){
                for(Operation operation: operationsList){
                    if(example.charAt(i) == operation.getOperChar()){
                        executionOperation = operation;
                        leftNumber = Double.parseDouble(example.substring(0, i));
                        rightNumber = Double.parseDouble(example.substring(i+1,example.length()));
                    }
                }
            }
            return getAnswer(leftNumber, rightNumber, executionOperation);
        }catch (Exception ex){
            return "ERROR";
        }
    }

    private String getAnswer(Double leftNumber, Double rightNumber, Operation executionOperation){
        switch (executionOperation){
            case PLUS -> {
                return String.valueOf(leftNumber + rightNumber);
            }
            case MINUS -> {
                return String.valueOf(leftNumber - rightNumber);
            }
            case MULTIPLY -> {
                return String.valueOf(leftNumber * rightNumber);
            }
            case DIVISION -> {
                return String.valueOf(leftNumber / rightNumber);
            }
            case MOD -> {
                return String.valueOf(leftNumber % rightNumber);
            }
            default -> {
                return "ERROR";
            }
        }
    }
}
