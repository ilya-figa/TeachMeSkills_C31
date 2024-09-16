package lesson13.exception;

public class WrongPasswordException extends Exception {

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
    }
}
