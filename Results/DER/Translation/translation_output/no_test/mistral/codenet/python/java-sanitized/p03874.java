import java.util.Scanner;
import java.math.BigInteger;

public class p03874 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = 512;
        BigInteger[] a = new BigInteger[n];
        for (int i = 0; i < n; i++) {
            BigInteger val = BigInteger.valueOf(7 + i).multiply(BigInteger.valueOf(i + 1)).divide(BigInteger.valueOf(i).multiply(BigInteger.valueOf(7)));
            a[i] = val;
        }
        for (int i = 0; i < n; i++) {
            a[i] = a[i].reverse();
        }
        int cnt = 600 * 7;
        String[] ans = new String[n];
        for (int i = 0; i < n; i++) {
            ans[i] = "FESTIVA".repeat(k / a[i]);
            k %= a[i];
        }
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i].substring(ans[i].length() - a[i].toString().length());
            ans[i] = ans[i].replace("0", "L");
        }
        System.out.println(String.join("", ans));
    }
}