Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int gcd(int m, int n) {
            while (n != 0) {
                int temp = m % n;
                m = n;
                n = temp;
            }
            return m;
        }

        int lcm(int m, int n) {
            return m / gcd(m, n) * n;
        }

        int carmichael(int x) {
            int r = 1;

            int b = 0;
            while ((x & 1) == 0) {
                b += 1;
                x >>= 1;
            }
            if (b > 1) {
                r = 2;
                if (b == 2) {
                    r = 2;
                } else {
                    r = (int) Math.pow(2, b - 2);
                }
            }

            int y = 3;
            while (y * y <= x) {
                if (x % y == 0) {
                    int c = 0;
                    while (x % y == 0) {
                        x /= y;
                        c += 1;
                    }
                    r = lcm(r, (y - 1) * (int) Math.pow(y, c - 1));
                }
                y += 1;
            }
            if (x > 1) {
                r = lcm(r, x - 1);
            }
            return r;
        }

        int solve(int x, int c) {
            if (c == 1) {
                return 1;
            }
            x = x % c;
            int sq = (int) Math.sqrt(c) + 1;

            int[] mp = new int[sq];

