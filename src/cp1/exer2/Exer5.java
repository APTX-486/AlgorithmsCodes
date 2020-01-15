package cp1.exer2;

import edu.princeton.cs.algs4.StdOut;

public class Exer5 {
    public static void main(String[] args) {
        String s = "Hello World";
        s.toUpperCase();
        s.substring(6, 11);
        StdOut.println(s);

        s = s.toUpperCase();
        StdOut.println(s);
        s = s.substring(6, 11);
        StdOut.println(s);
    }
}
