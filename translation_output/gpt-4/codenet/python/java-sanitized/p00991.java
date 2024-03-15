import java.math.BigInteger;
import java.util.Scanner;

public class p00991 {

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static BigInteger comb(int x, int y) {
        return factorial(x)
            .divide(factorial(x - y))
            .divide(factorial(y));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        int h = scanner.nextInt();
        int ax = scanner.nextInt();
        int ay = scanner.nextInt();
        int bx = scanner.nextInt();
        int by = scanner.nextInt();

        int dx = Math.min(w - Math.abs(ax - bx), Math.abs(ax - bx));
        int dy = Math.min(h - Math.abs(ay - by), Math.abs(ay - by));
        int ans = 1;
        if (dx * 2 == w) ans *= 2;
        if (dy * 2 == h) ans *= 2;
        ans *= comb(dx + dy, dx).intValue();

        System.out.println(ans % 100000007);

        scanner.close();
    }
}