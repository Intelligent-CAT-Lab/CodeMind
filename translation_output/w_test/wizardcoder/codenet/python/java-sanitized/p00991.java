import java.util.*;
import java.math.*;

public class p00991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int bx = sc.nextInt();
        int by = sc.nextInt();
        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        int ans = 1;
        if (dx * 2 == w) ans *= 2;
        if (dy * 2 == h) ans *= 2;
        int n = dx + dy;
        int r = dx;
        BigInteger factorial = BigInteger.valueOf(1);
        BigInteger denominator = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
            denominator = denominator.multiply(BigInteger.valueOf(r));
            r--;
        }
        ans *= factorial.divide(denominator).mod(BigInteger.valueOf(100000007));
        System.out.println(ans);
    }
}