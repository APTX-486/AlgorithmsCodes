package cp1.exer2;

import edu.princeton.cs.algs4.Point2D;
import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Exer1 {
    private Point2D[] points;
    private int N;

    public Point2D[] genPoints(int N) {
        this.N = N;
        points = new Point2D[N];
        for (int i = 0; i < N; i++) {
            double x = Math.random();
            double y = Math.random();
            points[i] = new Point2D(x, y);
        }
        return points;
    }

    public double distance(Point2D a, Point2D b) {
        double d = Math.sqrt((a.x() - b.x()) * (a.x() - b.x()) +
                (a.y() - b.y()) * (a.y() - b.y()));
        return d;
    }

    public double minDistance() {
        Double[] d = new Double[N * (N - 1) / 2];
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                d[count] = distance(points[i], points[j]);
                count++;
            }
        }
        Arrays.sort(d);
        return d[0];
    }

    public static void main(String[] args) {

        int T = 10;
        Long[] times = new Long[T];

        for (int i = 0; i < T; i++) {
            long startTime=System.currentTimeMillis();
            Exer1 exer1 = new Exer1();
            exer1.genPoints(i);
            long endTime=System.currentTimeMillis();
            long runtime = endTime - startTime;
            times[i] = runtime;
        }

        for (int i = 0; i < times.length; i++) {
            System.out.println(times[i]);
        }

//        for (int i = 0; i < T; i++) {
//            StdDraw.setXscale(0,T);
//            StdDraw.setYscale(0,1500);
//            StdDraw.setPenRadius(.005);
//            StdDraw.setPenColor(StdDraw.RED);
//            StdDraw.point(i, times[i]);
//        }
    }
}
