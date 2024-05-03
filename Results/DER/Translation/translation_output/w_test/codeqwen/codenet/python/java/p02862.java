Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if ((x + y) % 3 != 0 || 3 * x < x + y || 3 * y < x + y) {
            System.out.println(0);
            return;
        }
        int n = (x + y) / 3;
        x -= n;
        y -= n;
        long[] fact = new long[n + 1];
        fact[0] = fact[1] = 1;
        for (int i = 2; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % 1000000007;
        }
        long factX = fact[x];
        long factY = fact[y];
        long factN = fact[n];
        // System.out.println(x + " " + y + " " + n);
        // System.out.println(factX + " " + factY + " " + factN);

        long c = factN * modinv(factX, 1000000007) * modinv(factY, 1000000007);
        c %= 1000000007;
        System.out.println(c);
    }

    public static long modinv(long a, long m) {
        long x0 = 1, y0 = 0, x1 = 0, y1 = 1;
        while (b != 0) {
            long q = a / b;
            long temp = a;
            a = b;
            b = temp % b;
            temp = x0;
            x0 = x1;
            x1 = temp - q * x1;
            temp = y0;
            y0 = y1;
            y1 = temp - q * y1;
        }
        if (a != 1) {
            throw
