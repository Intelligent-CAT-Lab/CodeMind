import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
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
            r[t - 1 - i] = 1;
        }
        n -= a[t - 1];
        for (int i = 0; i < t; i++) {
            if (n <= 0) {
                break;
            }
            int ts = Math.min(t, n);
            r[t + i] = 1;
            r[t + i - ts] = 0;
            n -= ts;
        }
        for (int i = 0; i < 2 * t; i++) {
            if (r[i] == 0) {
                System.out.print(")");
            } else {
                System.out.print("(");
            }
        }
        System.out.println();
    }
}