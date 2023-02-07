package Chapter7_Arrays.latihan;

public class listing7_8_SelectionSort {
    /** the method for sorting the numbers */
    public static void selectionSort(double[] list) {
        for (int  i = 0; i < list.length - 1; i++) {
            //find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = 1;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMinIndex = j;
                }
            }

            // swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }
}
