public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        return (0 <= hourOfDay && hourOfDay <= 23) && (hourOfDay < 8 || 22 < hourOfDay) && barking;
    }
}
