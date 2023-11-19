public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        int absNumber = Math.abs(number);
        int reversedNumber = 0;

        while (absNumber != 0) {
            int lastDigit = absNumber % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            absNumber /= 10;
        }

        return Math.abs(number) == reversedNumber;
    }
}
