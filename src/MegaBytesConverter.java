public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes >= 0) {
            int conversion = 1024;
            int remainingKilobytes = kiloBytes % conversion;
            int megaBytes = (kiloBytes - remainingKilobytes) / conversion;
            System.out.print(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKilobytes + " KB");
        } else {
            System.out.print("Invalid Value");
        }
    }
}
