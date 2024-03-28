import java.util.Scanner;
import java.math.BigInteger;

public class p03874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 512;
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            BigInteger val = BigInteger.ONE.multiply(BigInteger.valueOf(7 + i)).divide(BigInteger.valueOf(i).multiply(BigInteger.valueOf(7)));
            a[i] = val;
        }
        for (int i = 0; i < n; i++) {
            a[i].reverse();
        }
        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA";
            for (int j = 0; j < k / a[i]; j++) {
                ans[i] += "L";
            }
            k %= a[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i].substring(ans[i].length() - 1);
        }
        System.out.println(String.join("", ans));
    }
}