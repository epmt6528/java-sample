public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if(bigCount < 0 || smallCount < 0 || goal < 0) return false;

        int BIG_WEIGHT = 5;

        int maxBigBags = goal / BIG_WEIGHT;
        int bigBagsToUse = Math.min(bigCount, maxBigBags);

        goal -= bigBagsToUse * BIG_WEIGHT;

        return smallCount >= goal;
    }
}
