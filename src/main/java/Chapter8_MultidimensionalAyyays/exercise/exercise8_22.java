package Chapter8_MultidimensionalAyyays.exercise;

public class exercise8_22 {
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random() * 2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Every row" + (isAllRowsEven1s(matrix) ? " " : " does not " + "have an even number of 1s"));
        System.out.println("Every column" + (isAllColumnsEven1s(matrix) ? " " : " does not " + "have an even number of 1s"));
    }

    public static boolean isAllRowsEven1s(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[i][j] == 1)
                    count++;
            }
            if (count % 2 != 0)
                return false;
        }
        return true;
    }

    public static boolean isAllColumnsEven1s(int[][] m) {
        int count = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (m[j][i] == 1)
                    count++;
            }
            if (count % 2 != 0)
                return false;
        }
        return true;
    }
}
