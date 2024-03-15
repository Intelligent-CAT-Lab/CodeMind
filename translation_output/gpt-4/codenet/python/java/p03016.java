Here's the equivalent Java code for the given Python code:

```java
import java.util.Scanner;
import java.math.BigInteger;

public class ExpNpExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long m = scanner.nextLong();

        int first_d = String.valueOf(a).length();
        long tail = a + b * (l - 1);

        long lo = -1;
        long[][] state = {{0, a % m, 1}};

        for (int d = first_d; d < 19; d++) {
            long hi = Math.min((pow(10, d) - 1 - a) / b, l - 1);
            long cnt = hi - lo;
            long[][] coe = {
                    {pow(10, d, m), 0, 0},
                    {1, 1, 0},
                    {0, b % m, 1}
            };

            coe = expNp(coe, cnt, m);
            state = matMul(state, coe, m);

            lo = hi;
            if (hi == l - 1) {
                break;
            }
        }

        System.out.println(state[0][0]);
        scanner.close();
    }

    public static long pow(long a, int b, long m) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) {
                res = (res * a) % m;
            }
            a = (a * a) % m;
            b >>= 1;
        }
        return res % m;
    }

    public static long[][] expNp(long[][] a, long e, long m) {
        long[][] r = identity(a.length);
        long[][] t = copyMatrix(a);
        while (e > 0) {
            if (e % 2 == 1) {
                r = matMul(r, t, m);
            }
            t = matMul(t, t, m);
            e >>= 1;
        }
        return r;
    }

    public static long[][] identity(int size) {
        long[][] id = new long[size][size];
        for (int i = 0; i < size; i++) {
            id[i][i] = 1;
        }
        return id;
    }

    public static long[][] copyMatrix(long[][] matrix) {
        long[][] newMatrix = new long[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            System.arraycopy(matrix[i], 0, newMatrix[i], 0, matrix[i].length);
        }
        return newMatrix;
    }

    public static long[][] matMul(long[][] a, long[][] b, long m) {
        long[][] result = new long[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    result[i][j] = (result[i][j] + a[i][k] * b[k][j]) % m;
                }
            }
        }
        return result;
    }

    public static long pow(long x, int y) {
        return BigInteger.valueOf(x).pow(y).longValue();
    }
}
```

I have translated the given Python code into Java by following these steps:

1. Import `java.util.Scanner` and `java.math.BigInteger` in place of Python's `input()` function and arbitrary-precision integer operations, respectively.
2. Create methods for operations such as matrix multiplication `matMul`, exponentiation of a number `pow` with respect to a modulus, creating an identity matrix `identity`, and copying a matrix `copyMatrix`.
3. Implement the `expNp` method, which mimics the behavior of the original `exp_np` function in Python but is adapted to Java syntax and types.
4. Use a `Scanner` object to fetch the input from the user.
5. Replace Python's dynamic lists with fixed-size arrays. Java arrays have a static size, so sizes have to be provided when initializing the arrays.
6. Remove the use of NumPy and replace it with equivalent handwritten Java methods.
7. Modify loop conditions and index calculations to match Java's 0-based array indexing.
8. Output the result to the console with `System.out.println`.

Remember to take care of modulo operations when dealing with large numbers in Java. It could lead to long overflow if not managed properly. Use `BigInteger` for operations that are likely to exceed the range of `long`.
