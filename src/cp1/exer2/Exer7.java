package cp1.exer2;

import edu.princeton.cs.algs4.StdOut;

public class Exer7 {
    public static String mystery(String s) {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(a) + mystery(b);
    }

    public static void main(String[] args) {
        String s = "Hello World";
        StdOut.println(mystery(s));
    }
}
