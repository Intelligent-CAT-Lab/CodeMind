import java.util.*;
import java.io.*;

public class p01813 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] a = new int[s.length()];
        int i = 0;
        for (char c : s.toCharArray()) {
            if (c >= '0' && c <= '9') {
                a[i] = a[i] * 10 + (c - '0');
            } else {
                a[i] = c;
                i++;
            }
        }
        int[] r = f(a);
        System.out.println(r[1]);
    }

    public static int[] f(int[] a) {
        Map<Integer, int[]> fm = new HashMap<>();
        int[] r = new int[2];
        r[0] = Integer.MAX_VALUE;
        r[1] = Integer.MIN_VALUE;
        int i = 0;
        for (; i < a.length; i++) {
            if (a[i] >= '0' && a[i] <= '9') {
                continue;
            }
            break;
        }
        if (i == a.length) {
            r[0] = a[0];
            r[1] = a[0];
            return r;
        }
        if (i > 0) {
            int[] t = f(Arrays.copyOfRange(a, i, a.length));
            r[0] = Math.min(r[0], t[0]);
            r[1] = Math.max(r[1], t[1]);
        }
        for (int j = i + 1; j < a.length; j++) {
            if (a[j] >= '0' && a[j] <= '9') {
                continue;
            }
            if (a[j] == '(') {
                continue;
            }
            if (a[j] == ')') {
                break;
            }
            int[] t = f(Arrays.copyOfRange(a, i, j));
            if (a[j] == '+') {
                r[0] = Math.min(r[0], t[0]);
                r[1] = Math.max(r[1], t[1]);
            } else {
                r[0] = Math.min(r[0], t[0] - t[1]);
                r[1] = Math.max(r[1], t[0] - t[1]);
            }
        }
        return r;
    }
}