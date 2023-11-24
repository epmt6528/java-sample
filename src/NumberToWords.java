public class NumberToWords {
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);
        int digitCount = getDigitCount(number);

        while(digitCount > 0){
            int lastDigit = reversedNumber % 10;
            String word = switch (lastDigit) {
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> ""; // This should never happen

            };

            System.out.println(word);

            reversedNumber /= 10;
            digitCount --;
        }
    }

    public static int reverse(int number){
        int reversedNumber = 0;

        while(number != 0){
            int lastDigit = number % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            number /= 10;
        }

        return reversedNumber;
    }

    public static int getDigitCount(int number){
        if(number < 0) return -1;
        if(number == 0) return 1;

        int counter = 0;

        while(number > 0){
            counter ++;
            number /= 10;
        }

        return counter;
    }
}