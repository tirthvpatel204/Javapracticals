public class driver1 {

    public static void main(String[] args) {

        Point1[] points = {
                new Point1(1, 2),
                new Point1(3, 4),
                new Point1(1, 2),
                new Point1(5, 6),
                new Point1(3, 4)
        };

        int count = 0;

        for (int i = 0; i < points.length; i++) {

            boolean found = false;

            for (int j = 0; j < i; j++) {
                if (points[i].equals(points[j])) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                count++;
            }
        }

        System.out.println("Distinct: " + count);
    }
}