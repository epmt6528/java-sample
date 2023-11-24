public class LastDigitChecker {
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(!isValid(a) || !isValid(b) || !isValid(c)) return false;

        int aRightMostDigit = a % 10;
        int bRightMostDigit = b % 10;
        int cRightMostDigit = c % 10;

        return aRightMostDigit == bRightMostDigit || aRightMostDigit == cRightMostDigit || cRightMostDigit == bRightMostDigit;
    }

    public static boolean isValid(int number) {
        return 10 <= number && number <= 1000;
    }
}
