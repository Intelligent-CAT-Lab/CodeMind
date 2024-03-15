import java.util.Scanner;
import java.math.BigInteger;

public class p02858 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int T = sc.nextInt();
        int gh = gcd(H, T);
        int gw = gcd(W, T);
        int h = H / gh;
        int w = W / gw;
        BigInteger MOD = new BigInteger("1000000007");
        BigInteger ans = pow(pow(2, h, MOD) + pow(2, w, MOD) + pow(2, gcd(h, w), MOD) - 3, gh * gw, MOD);
        System.out.println(ans);
    }
    
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    public static BigInteger pow(BigInteger a, BigInteger b, BigInteger mod) {
        BigInteger res = BigInteger.ONE;
        while (b.compareTo(BigInteger.ZERO) > 0) {
            if (b.and(BigInteger.ONE).equals(BigInteger.ONE)) {
                res = res.multiply(a, mod);
            }
            a = a.modPow(mod);
            b = b.shiftRight(1);
        }
        return res;
    }
}