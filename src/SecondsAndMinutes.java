public class SecondsAndMinutes {
    public static void main(String[] args){
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
    }

    public static String getDurationString(int seconds) {
        if(seconds <= 0) return "Invalid Input";
        int minutes = seconds / 60;
        int hours = minutes / 60;

        return hours + "h" + (minutes - hours * 60) + "m" + (seconds - minutes * 60) + "s";
    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes < 0 || seconds < 0 || 60 <= seconds) return "Invalid Input";
        return getDurationString(minutes * 60 + seconds);
    }
}
