import java.util.*;
import java.io.*;

public class p03209 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int x = Integer.parseInt(input[1]);

        long[] l = new long[51];
        long[] p = new long[51];
        l[0] = 1;
        p[0] = 1;
        for (int i = 1; i < 51; i++) {
            l[i] = l[i - 1] * 2 + 3;
            p[i] = p[i - 1] * 2 + 1;
        }

        long ans = 0;
        for (int i = n; i >= 0; i--) {
            if (i == 0 && x >= 1) {
                ans += 1;
                break;
            }

            if (x <= 1) {
                break;
            } else if (x <= l[i - 1] + 1) {
                x -= 1;
                continue;
            } else if (x == l[i - 1] + 2) {
                ans += 1;
                x -= 2;
            } else {
                ans += p[i - 1] + 1;
                x -= l[i - 1] + 2;
            }
        }
        System.out.println(ans);
    }
}