public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) return -1;
        int firstDigit = number % 10;

        int lastDigit = number;
        while(lastDigit >= 10){
            lastDigit /= 10;
        }

        return lastDigit + firstDigit;
    }
}
