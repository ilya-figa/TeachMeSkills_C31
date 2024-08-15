package Lesson_6;

/**
 * @author Buyevich_I
 */
public enum Operation {
    ADD("Adding "),
    WITHDRAW("Withdrawing");

    private String text;

    Operation(String text){
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
