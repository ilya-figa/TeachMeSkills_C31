package game_guess_word;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * guess the words game
 * only enter English letters
 *
 * @author Buyevich_I
 */
public class GameGuessWord {
    private static final Scanner scanner = new Scanner(System.in);

    public static final String PATTERN_ENG_LETTERS = "[a-zA-Z]+";
    private String word = null;

    public void startGame() {
        StringBuilder openLetters;
        char[] hiddenWord;
        while (true) {
            hiddenWord = getHiddenWord();
            openLetters = new StringBuilder();
            printArr(hiddenWord);

            while (true) {
                String letters = getEnteredLetters();
                if (letters.length() == 1) {
                    char letter = letters.charAt(0);
                    if (!isLetterEntered(openLetters.toString(), letter)) {
                        if (isFoundLetter(hiddenWord, letter)) {
                            openLetters.append(letters.charAt(0));
                            System.out.println("Yes, there is such a letter");
                            printArr(hiddenWord);
                            if (isCheckWordGuessed(hiddenWord)) {
                                System.out.println("Guessed the whole word : " + word);
                                break;
                            }
                        } else {
                            System.out.println("There is no such letter");
                        }
                    } else {
                        System.out.println("Entered this letter");
                    }
                } else {
                    if (isFoundWord(letters)) {
                        System.out.println("Guessed the whole word : " + word);
                        break;
                    } else {
                        System.out.println("Didn't guess the word");
                    }
                }
            }

            System.out.print("repeat? y/n: ");

            if (scanner.nextLine().equals("y")) {
                System.out.println("---NG---");
            } else {
                System.out.println("GOODBYE!");
                return;
            }
        }
    }

    private char[] getHiddenWord() {
        while (true) {
            System.out.print("Enter word (only enter English letters): ");

            this.word = scanner.nextLine();
            if (Pattern.matches(PATTERN_ENG_LETTERS, this.word)) {
                char[] hiddenWord = new char[this.word.length()];
                Arrays.fill(hiddenWord, '*');
                return hiddenWord;
            } else {
                System.out.println("You entered an incorrect word.");
            }
        }
    }

    private String getEnteredLetters() {
        String letters;
        while (true) {
            System.out.print("Enter letter or the whole word (only enter English letters): ");

            letters = scanner.nextLine();
            if (Pattern.matches(PATTERN_ENG_LETTERS, letters)) {
                return letters;
            } else {
                System.out.println("You entered an incorrect letters.");
            }
        }
    }

    private boolean isFoundLetter(char[] hiddenWord, char letter) {
        boolean isFound = false;
        for (int i = 0; i < this.word.length(); i++) {
            if (this.word.charAt(i) == letter) {
                isFound = true;
                hiddenWord[i] = letter;
            }
        }
        return isFound;
    }

    private boolean isFoundWord(String word) {
        if (this.word.length() != word.length()) {
            return false;
        }
        for (int i = 0; i < this.word.length(); i++) {
            if (this.word.charAt(i) != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    private boolean isCheckWordGuessed(char[] hiddenWord) {
        for (char c : hiddenWord) {
            if (c == '*') {
                return false;
            }
        }
        return true;
    }

    private boolean isLetterEntered(String word, char letter) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                return true;
            }
        }
        return false;
    }

    public static void printArr(char[] charArr) {
        System.out.println(Arrays.toString(charArr));
    }
}
