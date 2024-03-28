import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[50000];
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i-1] + i;
        }
        int t = Arrays.binarySearch(a, n);
        if (t < 0) {
            t = -t - 1;
        }
        int[] r = new int[t];
        Arrays.fill(r, 1);
        for (int i = 0; i < t; i++) {
            int ai = a[t-i-1];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai-n);
                int tmp = r[ti-ts];
                r[ti-ts] = r[ti];
                r[ti] = tmp;
                n -= t - ts;
            } else {
                break;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.print(r[i] == 1 ? '(' : ')');
        }
        System.out.println();
    }
}

/content/post/2020-01-01-python-code-to-java-code-0000