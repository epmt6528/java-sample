public class LeapYear {
    public static boolean isLeapYear(int year) {
        if(year < 1 || 9999 < year) return false;
        boolean divisibleBy4 = year % 4 == 0;
        boolean divisibleBy100 = year % 100 == 0;
        boolean divisibleBy400 = year % 400 == 0;

        return (divisibleBy4 && divisibleBy100 && divisibleBy400) || (divisibleBy4 && !divisibleBy100);
    }
}