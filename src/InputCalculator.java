import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;
        long average = 0;

        while(true){
            boolean hasNextInt = scanner.hasNextInt();
            if (!hasNextInt) {
                break;
            }

            sum += scanner.nextInt();
            counter ++;
            scanner.nextLine();
        }

        if (counter > 0) {
            average = Math.round((double) sum / counter);
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
