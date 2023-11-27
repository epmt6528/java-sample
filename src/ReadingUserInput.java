import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 1;

        while(counter <= 5) {
            System.out.println("Enter number #" + counter + ":");
            int input = getInputFromScanner();
            sum += input;
            counter++;
        }

        System.out.println("Sum of all numbers is: " + sum);
    }

    private static int getInputFromScanner(){
        Scanner scanner = new Scanner(System.in);
        int inputInNumber = -1;

        do {
            String userInput = scanner.nextLine();
            inputInNumber = parseData(userInput);
        } while(inputInNumber < 0);

        return inputInNumber;
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
