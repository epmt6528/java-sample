public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;

        for(int i = 1; i <= 1000 && counter < 5; i++) {
            if(i % 3 == 0 && i % 5 == 0) {
                sum += i;
                counter++;
                System.out.println(i);
            }
        }

        System.out.print("Sum is " + sum);
    }
}
