public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.print("Invalid Value");
        } else {
            int days = (int) (minutes - minutes % (24 * 60)) / (24 * 60);
            int year = (days - days % 365) / 365;

            System.out.print(minutes + " min = " + year + " y and " + (days - year * 365) + " d");
        }
    }
}
