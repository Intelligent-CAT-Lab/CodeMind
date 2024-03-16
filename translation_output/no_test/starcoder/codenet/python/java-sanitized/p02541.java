import java.util.*;
import java.io.*;

public class p02541 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] divisors = new int[n];
        int i = 0;
        for (int j = 1; j <= n; j++) {
            if (n % j == 0) {
                divisors[i++] = j;
                if (j!= n / j) {
                    divisors[i++] = n / j;
                }
            }
        }
        Arrays.sort(divisors);
        int ans = n - 1;
        if (n % 2 == 0) {
            ans = 2 * n - 1;
        }
        for (int x : divisors) {
            int y = n * 2 / x;
            if (y == 1) {
                continue;
            }
            int[] r = new int[]{0, y - 1};
            int[] m = new int[]{x, y};
            int rem = 0, mod = 0;
            for (int i = 0; i < 2; i++) {
                rem = (rem + r[i]) % m[i];
                mod = (mod + m[i]) % m[i];
            }
            if (rem == 0 && mod == 0) {
                continue;
            }
            ans = Math.min(ans, rem);
        }
        System.out.println(ans);
    }
}