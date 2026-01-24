package day8.practice;

public class LineComparison {

    // Point class
    static class Point {
        double x;
        double y;

        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }

    // Line class implementing Comparable
    static class Line implements Comparable<Line> {

        Point p1;
        Point p2;
        Double length;

        Line(Point p1, Point p2) {
            this.p1 = p1;
            this.p2 = p2;
            this.length = calculateLength();
        }

        private Double calculateLength() {
            return Math.sqrt(
                    Math.pow(p2.x - p1.x, 2) +
                            Math.pow(p2.y - p1.y, 2)
            );
        }

        // UC 1 - Equality check
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (!(obj instanceof Line))
                return false;

            Line other = (Line) obj;
            return this.length.equals(other.length);
        }

        // UC 2 - Compare lines
        @Override
        public int compareTo(Line other) {
            return this.length.compareTo(other.length);
        }
    }

    // Main method
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program");

        Line line1 = new Line(
                new Point(1, 2),
                new Point(4, 6)
        );

        Line line2 = new Line(
                new Point(1, 2),
                new Point(5, 7)
        );

        // UC 1 - Equals
        if (line1.equals(line2)) {
            System.out.println("Both lines are equal");
        } else {
            System.out.println("Both lines are not equal");
        }

        // UC 2 - CompareTo
        int result = line1.compareTo(line2);

        if (result == 0) {
            System.out.println("Both lines are equal in length");
        } else if (result > 0) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 1 is less than Line 2");
        }
    }
}
