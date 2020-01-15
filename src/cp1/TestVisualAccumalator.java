package cp1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestVisualAccumalator {
    public static void main(String[] args) {
        int T = Integer.parseInt(args[0]);
        VisualAccumalator a = new VisualAccumalator(T, 1.0);
        for (int t = 0; t < T; t++) {
            a.addDataValue(StdRandom.random());
        }
        StdOut.println(a);
    }
}
