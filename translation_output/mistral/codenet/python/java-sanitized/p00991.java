import java.util.Scanner;
import java.math.BigInteger;

public class p00991 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w, h, ax, ay, bx, by;
        w = sc.nextInt();
        h = sc.nextInt();
        ax = sc.nextInt();
        ay = sc.nextInt();
        bx = sc.nextInt();
        by = sc.nextInt();
        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        BigInteger ans = BigInteger.ONE;
        if (dx * 2 == w) {
            ans = ans.multiply(BigInteger.valueOf(2));
        }
        if (dy * 2 == h) {
            ans = ans.multiply(BigInteger.valueOf(2));
        }
        ans = ans.multiply(BigInteger.valueOf(comb(dx + dy, dx)));
        System.out.println(ans.mod(BigInteger.valueOf(100000007)));
    }

    public static BigInteger comb(int x, int y) {
        BigInteger result = BigInteger.ONE;
        result = result.divide(BigInteger.valueOf(factorial(x)));
        result = result.divide(BigInteger.valueOf(factorial(x - y)));
        result = result.divide(BigInteger.valueOf(factorial(y)));
        return result;
    }

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}