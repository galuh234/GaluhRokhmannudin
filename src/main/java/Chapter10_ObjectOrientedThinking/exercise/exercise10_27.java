package Chapter10_ObjectOrientedThinking.exercise;

public class exercise10_27 {
    public static void main(String[] args) {
        MyStringBuilder1 str1 = new MyStringBuilder1("TEST");

        System.out.println("\nAppend the string \" MyStringBuilder1\" to string: " +
                str1.append(new MyStringBuilder1(" MyStringBuilder1")));

        System.out.println("\nAppend integer 101 to the string: " + str1.append(101));

        System.out.println("\nLength of string: " + str1.length());

        System.out.println("\nCharacter at index 2: " + str1.charAt(2));

        System.out.println("\nString to lower case: " + str1.toLowerCase());

        System.out.println("\nSubstring of string from index 1 to 3: " +
                str1.substring(1, 3));

        System.out.println("\nDisplay string: " + str1.toString());
    }
}
