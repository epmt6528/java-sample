public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            return -1L;
        } else {
            long conversion = Math.round(kilometersPerHour/1.609);
            return conversion;
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if(kilometersPerHour < 0) {
            System.out.print("Invalid Value");
        } else {
            long conversion = Math.round(toMilesPerHour(kilometersPerHour));
            System.out.println(kilometersPerHour + " km/h = " + conversion + " mi/h");
        }
    }
}
