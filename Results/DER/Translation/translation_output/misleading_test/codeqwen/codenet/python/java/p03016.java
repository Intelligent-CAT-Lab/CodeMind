Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();

        int firstD = String.valueOf(a).length();
        int tail = a + b * (l - 1);

        int lo = -1;
        int[][] state = {{0, a % m, 1}};

        for (int d = firstD; d < 19; d++) {
            int hi = (int) Math.min((Math.pow(10, d) - 1 - a) / b, l - 1);
            int cnt = hi - lo;
            int[][] coe = {
                    {powerMod(10, d, m), 0, 0},
                    {1, 1, 0},
                    {0, b % m, 1}
            };

            state = multiplyMod(state, coe, m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
    }

    private static int powerMod(int base, int exponent, int mod) {
        int result = 1;
        base = base % mod;

        while (exponent > 0) {
            if ((exponent & 1) == 1)
                result = (result * base) % mod;

            exponent = exponent >> 1;
            base = (base * base) % mod;
        }
        return result;
    }

    private static int[][] multiplyMod(int[][] a, int[][] b, int mod) {
        int[][] result = new int[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for
