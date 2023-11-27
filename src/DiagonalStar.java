public class DiagonalStar {
    public static void printSquareStar(int number) {
        if(number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number; col++) {
                if (row == 1 || row == number || // First or last row
                        col == 1 || col == number || // First or last column
                        row == col ||                // Row number equals column number
                        col == number - row + 1) {   // Column number equals rowCount - currentRow + 1
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row is printed
        }
    }
}
