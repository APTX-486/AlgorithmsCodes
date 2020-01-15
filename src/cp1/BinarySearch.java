package cp1;


import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length -1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] whitelist = In.readInts(args[0]);

        Arrays.sort(whitelist);

//        Counter t = new Counter("keys");
//        exercise 1.2.9
        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
//            t.increment();
            if (rank(key, whitelist) == -1) {
                StdOut.println(key);
            }
        }
//        StdOut.println(t);
    }
}
