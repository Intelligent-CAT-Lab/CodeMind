import java.util.*;
import java.io.*;

public class p01883 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[50000];
        a[0] = 0;
        for (int i = 1; i < 50000; i++) {
            a[i] = a[i-1] + i;
        }
        int t = Arrays.binarySearch(a, n);
        if (t < 0) t = -t - 1;
        int[] r = new int[t];
        Arrays.fill(r, 1);
        for (int i = 0; i < t; i++) {
            int ai = a[t-i-1];
            int ti = t + i;
            if (n < ai) {
                int ts = Math.min(t, ai-n);
                r[ti-ts] = 0;
                n -= t - ts;
            } else {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            sb.append(r[i] == 1? "(" : ")");
        }
        System.out.println(sb.toString());
    }
}