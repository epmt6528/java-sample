public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int limitTemp = summer ? 45 : 35;

        return 25 <= temperature && temperature <= limitTemp;
    }
}
