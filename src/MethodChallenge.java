public class MethodChallenge {
    public static void main(String[] args) {
        displayHighScorePosition("Taichi", calculateHighScorePosition(1500));
        displayHighScorePosition("Taichi", calculateHighScorePosition(1000));
        displayHighScorePosition("Taichi", calculateHighScorePosition(500));
        displayHighScorePosition("Taichi", calculateHighScorePosition(100));
        displayHighScorePosition("Taichi", calculateHighScorePosition(25));
    }

    public static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list.");
    }

    public static int calculateHighScorePosition(int playerScore) {
        if(1000 <= playerScore){
            return 1;
        }else if(500 <= playerScore){
            return 2;
        }else if(100 <= playerScore){
            return 3;
        }else{
            return 4;
        }
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
         int total = feet * 12 + inches;
         return convertToCentimeters(total);
    }
}
