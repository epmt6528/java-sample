public class PrimeNumber {
    public static void main(String[] args) {
        int counter = 0;

        for(int num = 1; num <= 1000 && counter < 3; num++) {
            if(isPrime(num)) {
                counter++;
                System.out.println(num + " is a prime number");
            }
        }

    }

    public static boolean isPrime(int wholeNumber) {
        if(wholeNumber <= 2) {
            return wholeNumber == 2;
        }

        for(int divisor = 2; divisor <= wholeNumber/2; divisor++) {
            if(wholeNumber % divisor == 0) {
                return false;
            }
        }

        return true;
    }
}
