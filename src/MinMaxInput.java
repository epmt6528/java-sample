import java.util.Scanner;

public class MinMaxInput {
    public static void main(String[] args) {
        int min = -1;
        int max = -1;

        while(true) {
            System.out.println("====================");
            System.out.println("Enter number:");
            int input = getInputFromScanner();

            if(input < 0) break;

            if(max == -1 || max < input) max = input;
            if(min == -1 || input < min) min = input;

            System.out.println("Max number: " + max);
            System.out.println("Min number: " + min);
        };
    };

    private static int getInputFromScanner() {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        return parseData(userInput);
    }

    private static int parseData(String data) {
        int result = -1;

        try {
            result = Integer.parseInt(data);
        } catch(NumberFormatException e) {
            System.out.println("Invalid input");
        }

        return result;
    }
}
