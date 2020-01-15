package cp1.exer2;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

class VisualCounter {
    private int N;
    private int max;
    private int count = 0;
    private int number = 0;

    public VisualCounter(int N, int max) {
        this.N = N;
        this.max = max;
        StdDraw.setXscale(0,N);
        StdDraw.setYscale(-max, max);
        StdDraw.setPenRadius(.01);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(count, number);
    }

    public void increment() {
        if (count < N && Math.abs(number) < max) {
            count++;
            number++;
            StdDraw.point(count, number);
        } else {
            StdOut.println("Extend the range!");
        }
    }

    public void decrement() {
        if (count < N && Math.abs(number) < max) {
            count++;
            number--;
            StdDraw.point(count, number);
        } else {
            StdOut.println("Extend the range!");
        }
    }
    public String toString() {
        return count + "times";
    }
}

public class Exer10 {
    public static void main(String[] args) {
        VisualCounter v = new VisualCounter(70, 80);
        for (int t = 0; t < 30; t++) {
            if (StdRandom.bernoulli(0.5)) {
                v.increment();
            } else {
                v.decrement();
            }
        }
    }
}
