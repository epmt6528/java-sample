public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10) return -1;

        int smaller = Math.min(first, second);
        int answer = 1;

        for(int i = 1; i <= smaller; i++){
            if(first % i == 0 && second % i == 0) answer = i;
        }

        return answer;
    }
}