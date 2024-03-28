import java.util.*;
import java.io.*;

public class p01452 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);

        int cms = 1000000;
        int[] cm = new int[cms];
        cm[0] = 1;
        for (int i = 1; i < cms; i++) {
            cm[i] = (cm[i-1] * i) % 1000000007;
        }

        int n, m, k;
        while (true) {
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            if (n == 0) break;

            int r = 0;
            for (int i = 0; i <= k; i++) {
                int j = k - i;
                int mt = (int) ((cm[n+m+k*2] * inv(cm[n+i*2])) % 1000000007);
                int lk = (int) ((cm[n+i*2] * inv(cm[i])) % 1000000007);
                int rk = (int) ((cm[m+j*2] * inv(cm[j])) % 1000000007);
                r += mt * lk * rk % 1000000007;
                r %= 1000000007;
            }

            pw.println(r);
        }

        pw.close();
        sc.close();
    }

    public static int inv(int x) {
        return pow(x, 1000000006);
    }

    public static int pow(int x, int n) {
        int res = 1;
        while (n > 0) {
            if (n % 2 == 1) res = (res * x) % 1000000007;
            x = (x * x) % 1000000007;
            n /= 2;
        }
        return res;
    }
}