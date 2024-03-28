import java.util.*;
import java.io.*;

public class p01542 {
    public static void main(String[] args) {
        new Main().run();
    }

    class Node {
        int val;
        Node l, r;
        Node(int v) {
            val = v;
        }
    }

    void run() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) return;
        Node[] nodes = new Node[n];
        for (int i = 0; i < n; i++) {
            nodes[i] = new Node(sc.next());
        }
        for (int i = 0; i < n; i++) {
            Node node = nodes[i];
            int v = node.val;
            int l = 0, r = 0;
            for (int j = 0; j < v.length(); j++) {
                if (v.charAt(j) == '(') l++;
                if (v.charAt(j) == ')') r++;
            }
            if (l == 0 && r == 0) continue;
            if (l == 0 || r == 0) {
                node.val = -1;
                continue;
            }
            if (l > 1 || r > 1) {
                node.val = -1;
                continue;
            }
            if (v.indexOf('+') == -1 && v.indexOf('-') == -1 && v.indexOf('*') == -1) {
                node.val = -1;
                continue;
            }
            int p = v.indexOf('+');
            int m = v.indexOf('-');
            int o = p;
            if (p == -1) o = m;
            int li = 0, ri = 0;
            for (int j = o-1; j >= 0; j--) {
                if (v.charAt(j) == ')') {
                    ri++;
                    continue;
                }
                if (v.charAt(j) == '(') {
                    li++;
                    continue;
                }
                if (li == 0) {
                    li++;
                    continue;
                }
                if (ri == 0) {
                    ri++;
                    continue;
                }
                break;
            }
            if (li == 0 || ri == 0) {
                node.val = -1;
                continue;
            }
            int t = Integer.parseInt(v.substring(li, o), 2);
            int u = Integer.parseInt(v.substring(o+1, ri), 2);
            int tu = 0;
            if (o == p) tu = t + u;
            if (o == m) tu = t - u;
            if (t < 0 || t >= 1024 || u < 0 || u >= 1024 || tu < 0 || tu >= 1024) {
                node.val = -1;
                continue;
            }
            node.val