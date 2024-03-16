import java.math.BigInteger;
import java.util.Scanner;

public class p03431 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int p = 998244353;
        BigInteger[] f = new BigInteger[k+1];
        f[0] = BigInteger.ONE;
        for (int i = 1; i <= k; i++) {
            f[i] = f[i-1].multiply(BigInteger.valueOf(-i)).mod(BigInteger.valueOf(p));
        }
        BigInteger ans = BigInteger.ZERO;
        for (int i = k; i < n; i++) {
            ans = ans.add(f[i].multiply(f[n-i-1]).mod(BigInteger.valueOf(p)));
        }
        System.out.println(ans.mod(BigInteger.valueOf(p)));
    }
}