package Chapter7_Arrays.latihan;

public class listing7_6_LinearSearch {
    /** the method for finding a key in the list */
    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (key == list[i])
                return i;
        }
        return -1;
    }
}
