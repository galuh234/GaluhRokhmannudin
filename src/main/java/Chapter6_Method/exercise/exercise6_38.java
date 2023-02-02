package Chapter6_Method.exercise;

public class exercise6_38 {
    public static void main(String[] args) {
        final int NUMNBER_OF_UPPERCASE_LETTERS = 100;
        final int NUMNBER_OF_SINGLE_DIGITS = 100;
        final int NUMBERS_PER_LINE = 10;

        for (int i = 1; i <= NUMNBER_OF_UPPERCASE_LETTERS; i++) {
            System.out.print(RandomCharacter.getRandomUpperCaseLetter());
            System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
        }
        for (int i = 1; i <= NUMNBER_OF_SINGLE_DIGITS; i++) {
            System.out.print(RandomCharacter.getRandomDigitCharacter());
            System.out.print(i % NUMBERS_PER_LINE == 0 ? "\n" : " ");
        }
    }

    public class RandomCharacter {
        /**
         * Denerate a random character between ch1 and ch2
         */
        public static char getRandomCharacter(char ch1, char ch2) {
            return (char) (ch1 + Math.random() * (ch2 - ch1 + 1));
        }

        /**
         * Generate a random lowercase letter
         */
        public static char getRandomLowerCaseLetter() {
            return getRandomCharacter('a', 'z');
        }

        /**
         * Generate a random uppercase letter
         */
        public static char getRandomUpperCaseLetter() {
            return getRandomCharacter('A', 'Z');
        }

        /**
         * Generate a random digit character
         */
        public static char getRandomDigitCharacter() {
            return getRandomCharacter('0', '9');
        }

        /**
         * Generate a random character
         */
        public static char getRandomCharacter() {
            return getRandomCharacter('\u0000', '\uFFFF');
        }
    }
}
