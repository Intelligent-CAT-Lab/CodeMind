import java.util.*;
import java.io.*;

public class p03420 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nk = br.readLine().split(" ");
        int n = Integer.parseInt(nk[0]);
        int k = Integer.parseInt(nk[1]);
        long sum = 0;
        for (int b = k + 1; b <= n; b++) {
            int j = n / b;
            long an = j * (b - k);
            if (n % b > 0) {
                int x1 = j * b + k;
                if (k == 0) {
                    x1 += 1;
                }
                int x2 = Math.min(n, (j + 1) * b - 1);
                if (x2 >= x1) {
                    an += (x2 - x1 + 1);
                }
            }
            sum += an;
        }
        System.out.println(sum);
    }
}