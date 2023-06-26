public class SecondClass {
    public static void main(String[] args) {
        double value1 = 20.00;
        double value2 = 80.00;
        boolean bool = (value1 + value2) * 100.00 % 40.00 == 0;
        System.out.println(bool);

        if(!bool) System.out.println("got some reminder");
    }
}
