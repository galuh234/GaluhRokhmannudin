package Chapter7_Arrays.exercise;

public class exercise7_13 {
    public static  int getRandom(int... numbers) {
        int num;
        boolean isExcluded;
        do {
            isExcluded = false;
            num = 1 + (int)(Math.random() * 5);
            for (int e: numbers) {
                if (num == e)
                    isExcluded = true;
            }
        } while (isExcluded);
        return num;
    }
}
