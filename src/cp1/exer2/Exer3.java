package cp1.exer2;

import edu.princeton.cs.algs4.*;

class Intersect2D {
    private static Interval2D[] interval2DS;
    private int N;
    private double min;
    private double max;
    public Intersect2D(int N, double min, double max) {
        this.N = N;
        interval2DS = new Interval2D[N];
        for (int i = 0; i < N; i++) {
            Interval1D x;
            double x1 = StdRandom.uniform(min, max);
            double x2 = StdRandom.uniform(min, max);
            if (x1 < x2) {
                x = new Interval1D(x1, x2);
            } else {
                x = new Interval1D(x2, x1);
            }

            double y1 = StdRandom.uniform(min, max);
            double y2 = StdRandom.uniform(min, max);
            Interval1D y;
            if (y1 < y2) {
                y = new Interval1D(y1, y2);
            } else {
                y = new Interval1D(y2, y1);
            }

            interval2DS[i] = new Interval2D(x, y);
        }
    }

    public void showIntersect() {
        for (int i = 0; i < N; i++) {
            interval2DS[i].draw();
            for (int j = i + 1; j < N; j++) {
                if (interval2DS[i].intersects(interval2DS[j])) {
                    StdOut.println(i + " and " + j);
                }
            }
        }
    }
}
public class Exer3 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        double min = Double.parseDouble(args[1]);
        double max = Double.parseDouble(args[2]);

        Intersect2D intersect2D = new Intersect2D(N, min, max);
        intersect2D.showIntersect();
    }
}
