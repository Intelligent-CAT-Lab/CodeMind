import java.util.*;
import java.io.*;

public class p01813 {
    public static void main(String[] args) {
        new Main().run();
    }

    class Node {
        int min, max;
        Node[] child;
        Node(int min, int max) {
            this.min = min;
            this.max = max;
            child = new Node[2];
        }
    }

    Node root;

    void run() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        root = new Node(Integer.MAX_VALUE, Integer.MIN_VALUE);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= '0' && c <= '9') {
                int n = c - '0';
                if (i > 0 && s.charAt(i - 1) >= '0' && s.charAt(i - 1) <= '9') {
                    n += root.child[1].max * 10;
                }
                Node node = new Node(n, n);
                if (s.charAt(i - 1) == '(') {
                    root.child[1] = node;
                } else {
                    root.child[0] = node;
                }
            } else {
                Node node = new Node(Integer.MAX_VALUE, Integer.MIN_VALUE);
                if (c == '(') {
                    root.child[1] = node;
                } else {
                    root.child[0] = node;
                }
                root = node;
            }
        }
        System.out.println(root.child[1].min);
    }
}