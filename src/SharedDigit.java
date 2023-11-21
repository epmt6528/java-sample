public class SharedDigit {
    public static boolean hasSharedDigit(int a, int b) {
        if(a < 10 || 99 < a || b < 10 || 99 < b) return false;
        boolean result = false;
        int a1 = a % 10;
        int a2 = a / 10;


        while(!result && b > 0){
            int b1 = b % 10;
            if(b1 == a1 || b1 == a2) result = true;
            b /= 10;
        }

        return result;
    }
}