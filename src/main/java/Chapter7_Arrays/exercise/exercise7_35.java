package Chapter7_Arrays.exercise;

import java.util.Scanner;

public class exercise7_35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String play;
        do {
            char[] word = getWord();

            char[] asterisk = new char[word.length];
            fillAsterisks(asterisk);

            int missed = 0;
            do {
                char guess = getGuess(asterisk);

                if (!isCorrectGuess(word, asterisk, guess))
                    missed++;

            } while (!isWordFinish(asterisk));

            print(word, missed);

            System.out.println("Do you want to guess another word? Enter y on n>");
            play = input.next();

        } while (play.charAt(0) == 'y');
    }

    public static char[] getWord() {
        String[] words = {"write", "that", "program", "monkey", "rooster", "dog",
                "pig", "rat", "ox", "tiger", "rabbit", "dragon", "snake",
                "horse", "sheep"};

        String pick = words[(int)(Math.random() * words.length)];
        char[] word = new char[pick.length()];

        for (int i = 0; i < word.length; i++) {
            word[i] = pick.charAt(i);
        }
        return word;
    }

    /** fillAsterisks initializes a list with asterisks */
    public static void fillAsterisks(char[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = '*';
        }
    }

    /** checkGuess tests if the users guess was correct */
    public static boolean isCorrectGuess(char[] word, char[] blanks, char guess) {
        boolean correct = false;
        int message = 2;
        for (int i = 0; i < word.length; i++) {
            if (word[i] == guess) {
                correct = true;
                if (blanks[i] == guess)
                    message = 1;
                else {
                    blanks[i] = guess; // the actual letter is then displayed.
                    message = 0;
                }
            }
        }
        if (message > 0)
            print(message, guess);
        return correct;
    }

    /** isWordFinish */
    public static boolean isWordFinish(char[] blanks) {
        for (char e: blanks) {
            if (e == '*')
                return false;
        }
        return true;
    }

    /** print overloaded */
    public static void print(char[] word, int missed) {
        System.out.print("The word is ");
        System.out.print(word);
        System.out.println(" You missed " + missed + " time");
    }

    /** print overloaded */
    public static void print(int m, char guess) {
        System.out.print("\t" + guess);
        switch (m) {
            case 1 : System.out.println(" is already in the word"); break;
            case 2 : System.out.println(" is not in the word");
        }
    }

    /** getGuess prompts the user to guess one letter at a time */
    public static char getGuess(char[] asterisks){
        Scanner input = new Scanner(System.in);
        System.out.print("(Guess) Enter a letter in word ");
        System.out.print(asterisks);
        System.out.print(" > ");
        String g = input.next();
        return g.charAt(0);
    }
}
