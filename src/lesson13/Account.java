package lesson13;

import lesson13.exception.WrongLoginException;
import lesson13.exception.WrongPasswordException;
import static lesson13.Utils.*;
import static lesson13.Utils.isLengthCheck;

public class Account {

    public static boolean registration(String login, String password, String confirmPassword){
        try {
            loginCheck(login);

            passwordCheck(password);

            if(!password.equals(confirmPassword)){
                throw new WrongPasswordException("passwords do not match");
            }

            return true;
        } catch (WrongLoginException | WrongPasswordException ex) {
            System.err.println(ex.getMessage());
            return false;
        }
    }

    private static void loginCheck(String login) throws WrongLoginException {
        if(!isLengthCheck(login, 20)){
            getWrongLoginException("login length is not correct");
        }
        if(isContainsSpace(login)){
            getWrongLoginException("there is a space in the login");
        }
    }

    private static void passwordCheck(String password) throws WrongPasswordException {
        if(!isLengthCheck(password, 20)){
            getWrongPasswordException("password length is not correct");
        }

        if(isContainsSpace(password)){
            getWrongPasswordException("there is a space in the password");
        }

        if(!isContainsNum(password)){
            getWrongPasswordException("there is no number in the password");
        }
    }

    private static void getWrongLoginException(String msg) throws WrongLoginException {
        throw new WrongLoginException(msg);
    }

    private static void getWrongPasswordException(String msg) throws WrongPasswordException {
        throw new WrongPasswordException(msg);
    }
}
