public class WhileLoop {
    public static void main(String[] args) {
        int count = 5;
        int evenNumberCounter = 0;
        int evenNumberTotal = 0;
        int oddNumberTotal = 0;

        while (count <= 20) {
            if(isEvenNumber(count)) {
                evenNumberTotal += count;
                evenNumberCounter++;
            } else {
                oddNumberTotal += count;
            }
            count++;

            if(evenNumberCounter == 5) break;
        }

        System.out.println("even " + evenNumberTotal);
        System.out.println("odd " + oddNumberTotal);
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
