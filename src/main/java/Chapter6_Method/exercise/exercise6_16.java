package Chapter6_Method.exercise;

public class exercise6_16 {
    public static void main(String[] args) {
        System.out.println("Year     Days in year");
        for (int year = 2000; year <= 2020; year++) {
            System.out.println(year + "         " + numberOfDaysInAYear(year));
        }
    }
    /** Method numberOfDaysInAYear returns the number of days in a year*/
    public static int numberOfDaysInAYear(int year){
        if (isLeapYear(year))
            return 366;
        else
            return 365;
    }

    /** Method isLeapYear tests if a year is a leap year*/
    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}
