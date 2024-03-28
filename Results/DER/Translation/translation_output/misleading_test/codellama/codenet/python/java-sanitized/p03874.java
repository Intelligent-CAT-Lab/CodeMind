import java.util.Scanner;
import java.math.BigInteger;

public class p03874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int n = 512;
        int pattern = 0;
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            BigInteger val = BigInteger.valueOf(7 + i).factorial().divide(BigInteger.valueOf(i).factorial()).divide(BigInteger.valueOf(7).factorial());
            a[i] = val;
        }
        a = java.util.Arrays.reverse(a);

        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
            ans[i] += "L".repeat(k / a[i]);
            k %= a[i];
        }
        ans = java.util.Arrays.reverse(ans);

        System.out.println(String.join("", ans));
    }
}