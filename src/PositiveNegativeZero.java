public class PositiveNegativeZero {
    public static void checkNumber(int number) {
        String message = "zero";
        if(number > 0) {
            message = "positive";
        } else if(number < 0) {
            message = "negative";
        }
        System.out.print(message);
    }
}
