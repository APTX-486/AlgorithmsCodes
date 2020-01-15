package cp1.exer2;

import edu.princeton.cs.algs4.Interval1D;
import edu.princeton.cs.algs4.StdOut;

class Intersect1D{
    private static Interval1D[] interval1DS;
    private static int N;
    public Intersect1D(int N) {
        this.N = N;
        interval1DS = new Interval1D[N];
        for (int i = 0; i < N; i++) {
            double a = Math.random();
            double b = Math.random();
            if (a < b) {
                interval1DS[i] = new Interval1D(a , b);
            } else {
                interval1DS[i] = new Interval1D(b , a);
            }
        }
    }

    public static void printIntersect() {
        StdOut.println("Pairs of intersect intervals:");
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if(interval1DS[i].intersects(interval1DS[j])) {
                    StdOut.println(i + " and " + j);
                }
            }
        }
    }
}

public class Exer2 {
    public static void main(String[] args) {
        Intersect1D intercet1D = new Intersect1D(Integer.parseInt(args[0]));
        intercet1D.printIntersect();
    }
}
