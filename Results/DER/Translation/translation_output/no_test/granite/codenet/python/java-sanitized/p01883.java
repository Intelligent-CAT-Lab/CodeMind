import java.io.*;
import java.util.*;

class Main {
    static int I() throws IOException {
        return Integer.parseInt(F.next());
    }

    static long L() throws IOException {
        return Long.parseLong(F.next());
    }

    static String S() throws IOException {
        return F.next();
    }

    static BufferedReader F = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter O = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        int n = I();
        int[] a = new int[50000];
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i - 1] + i;
        }

        int t = Arrays.binarySearch(a, n);
        if (t < 0) {
            t = -t - 1;
        }
        int[] r = new int[50000];
        for (int i = 0; i < t; i++) {
            r[t - i - 1] = 1;
        }
        n -= t * (t - 1) / 2;
        for (int i = t; i < 50000; i++) {
            if (n <= i - t) {
                r[i] = 1;
                break;
            } else {
                n -= i - t;
                r[i] = 0;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            sb.append(r[i]);
        }
        O.println(sb.toString());
        O.close();
    }
}