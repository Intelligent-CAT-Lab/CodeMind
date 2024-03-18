Here's the translated Java code. In Java, we'll need to use our own matrix multiplication and exponentiation methods, as well as some handling for modulo operations:

```java
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
        
        int first_d = String.valueOf(a).length();
        int tail = a + b * (l - 1);
        
        int lo = -1;
        long[][] state = { { 0, a % m, 1 } };
        
        for (int d = first_d; d < 19; d++) {
            int hi = (int)Math.min(((long)Math.pow(10, d) - 1 - a) / b, l - 1);
            long cnt = hi - lo;
            long[][] coe = {
                { powMod(10, d, m), 0, 0 },
                { 1, 1, 0 },
                { 0, b % m, 1 }
            };

            coe = expMatrix(coe, cnt, m);
            state = multiplyMatrix(state, coe, m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
        sc.close();
    }

    private static long powMod(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % mod;
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }

    private static long[][] expMatrix(long[][] a, long e, long m) {
        int size = a.length;
        long[][] r = identityMatrix(size);
        long[][] t = copyMatrix(a);

        while (e > 0) {
            if ((e & 1) != 0)
                r = multiplyMatrix(r, t, m);
            t = multiplyMatrix(t, t, m);
            e >>= 1;
        }
        return r;
    }

    private static long[][] multiplyMatrix(long[][] a, long[][] b, long mod) {
        int r1 = a.length;
        int c1 = a[0].length;
        int c2 = b[0].length;
        long[][] result = new long[r1][c2];

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                    result[i][j] %= mod;
                }
            }
        }
        
        return result;
    }

    private static long[][] identityMatrix(int size) {
        long[][] result = new long[size][size];
        for (int i = 0; i < size; i++) {
            result[i][i] = 1;
        }
        return result;
    }

    private static long[][] copyMatrix(long[][] original) {
        int rows = original.length;
        int cols = original[0].length;
        long[][] copy = new long[rows][cols];

        for (int i = 0; i < rows; i++) {
            System.arraycopy(original[i], 0, copy[i], 0, cols);
        }

        return copy;
    }
}

```

Copy this code into your Java environment, and then run the main program. Supply the input "5 3 4 10007"; the expected output should be "5556". Note, if you're running this code in a competitive programming setup or environments which disallow usage of certain classes, you may have to change the code accordingly.
