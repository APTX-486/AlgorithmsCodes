package cp1;

import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        StdOut.println("Origin data:");
        while (!StdIn.isEmpty()) {
            int data = StdIn.readInt();
            StdOut.println(data);
            stack.push(data);
        }

        StdOut.println();
        StdOut.println("********************************************");
        StdOut.println("Reversed data:");

        for (int i : stack) {
            StdOut.println(i);
        }
    }
}
