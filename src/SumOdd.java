public class SumOdd {
    public static boolean isOdd(int number){
        if(number <= 0) return false;

        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if(start > end || start < 0 || end < 0) return -1;
        int total = 0;

        for(int i = start; i <= end; i++){
            if(isOdd(i)) total += i;
        }

        return total;
    }
}
