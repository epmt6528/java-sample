public class Point {
    private int x;
    private int y;

    public Point() {}
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(x*x + y*y);
    }

    public double distance(Point point) {
        int differenceX = this.x - point.getX();
        int differenceY = this.y - point.getY();

        return Math.sqrt(differenceX*differenceX + differenceY*differenceY);
    }

    public double distance(int x, int y) {
        int differenceX = this.x - x;
        int differenceY = this.y - y;

        return Math.sqrt(differenceX*differenceX + differenceY*differenceY);
    }
}