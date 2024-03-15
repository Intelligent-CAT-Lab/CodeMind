Here's the equivalent Java code for the Python script you've provided:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstLine = reader.readLine().trim().split("\\s+");
        int N = Integer.parseInt(firstLine[0]);
        int X = Integer.parseInt(firstLine[1]);

        System.out.println((N - gcd(N, X)) * 3);
    }

    private static int gcd(int a, int b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }

    // Helpers for multi-dimensional array creation with default values
    private static int[][] list2d(int a, int b, int c) {
        int[][] array = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = c;
            }
        }
        return array;
    }

    private static int[][][] list3d(int a, int b, int c, int d) {
        int[][][] array = new int[a][b][c];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    array[i][j][k] = d;
                }
            }
        }
        return array;
    }

    private static int[][][][] list4d(int a, int b, int c, int d, int e) {
        int[][][][] array = new int[a][b][c][d];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                for (int k = 0; k < c; k++) {
                    for (int l = 0; l < d; l++) {
                        array[i][j][k][l] = e;
                    }
                }
            }
        }
        return array;
    }

    // Helper to ceil divide two integers
    private static int ceil(int x, int y) {
        return (int) Math.ceil((double) x / y);
    }
    
    // Helper functions to print Yes/No in different cases
    private static void Yes() {
        System.out.println("Yes");
    }

    private static void No() {
        System.out.println("No");
    }

    private static void YES() {
        System.out.println("YES");
    }

    private static void NO() {
        System.out.println("NO");
    }
}
```

This Java code translates the functionality of the Python code you provided into Java, adhering to Java's syntax and conventions. This includes reading input from the standard input, performing the gcd operation, and handling multiple-dimensional arrays.

Please note that `sys.setrecursionlimit(10 ** 9)` has no equivalent in Java because Java doesn't limit the recursion stack depth the same way Python does. You should be careful with recursion in Java and ensure that you do not exceed the stack size, which can cause a `StackOverflowError`. If this code is used to process huge data sets or require deeper recursion, you might need to adjust the stack size with the `-Xss` JVM parameter. The `INF` and `MOD` variables are also not used in this converted code, but you could define them as constants in Java if needed for further logic.

Also, the `BigInteger` class is used in the `gcd` method, even though it's not necessary for basic integer GCD calculation since Java 8 in Java contains `Math.gcd`. However, I used `BigInteger` to keep it more in line with Python's handling of arbitrarily large integers. If you're certain that inputs will be within the range of Java's `int` type, you could replace it with `Math.gcd`.
