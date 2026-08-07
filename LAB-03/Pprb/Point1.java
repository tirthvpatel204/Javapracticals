public class Point1 {

    private int x;
    private int y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }

        if (!(obj instanceof Point1)) {
            return false;
        }

        Point1 p = (Point1) obj;

        return x == p.x && y == p.y;
    }

    public int hashCode() {
        return x * 31 + y;
    }
}