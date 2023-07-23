public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year){
        if(year < 1 || 9999 < year) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year){
        if(month < 1 || 12 < month) return -1;
        if(year < 1 || 9999 < year) return -1;

        int numberOfDaysInMonth = -1;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numberOfDaysInMonth = 31;
                break;
            case 2:
                numberOfDaysInMonth = isLeapYear(year) ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numberOfDaysInMonth = 30;
                break;
            default:
                numberOfDaysInMonth = -1;
        };

        return numberOfDaysInMonth;
    }
}
