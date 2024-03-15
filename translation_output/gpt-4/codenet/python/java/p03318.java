Here's the Python code translated to Java. Since Java does not have built-in equivalents for all the Python functionalities such as first-class functions and heapq, additional code is required to implement the equivalent functionality.

Please note that the code has been translated as closely as possible to the original Python script, but due to differences between the two languages, some Python idioms have been replaced with equivalent Java idioms where necessary.

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class Main {
    private static final BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    private static final int MOD = 1000000007;
    private static final double INF = Double.POSITIVE_INFINITY;

    // Utilities
    private static int[] LI() throws IOException {
        return Arrays.stream(stdin.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static double[] LF() throws IOException {
        return Arrays.stream(stdin.readLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
    }

    private static int[] LI_() throws IOException {
        return Arrays.stream(stdin.readLine().split(" ")).mapToInt(s -> Integer.parseInt(s) - 1).toArray();
    }

    private static int II() throws IOException {
        return Integer.parseInt(stdin.readLine());
    }

    private static double IF() throws IOException {
        return Double.parseDouble(stdin.readLine());
    }

    private static long[] IR(int n) throws IOException {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = II();
        }
        return res;
    }

    private static int[][] LIR(int n) throws IOException {
        int[][] res = new int[n][];
        for (int i = 0; i < n; i++) {
            res[i] = LI();
        }
        return res;
    }

    private static double[][] LFR(int n) throws IOException {
        double[][] res = new double[n][];
        for (int i = 0; i < n; i++) {
            res[i] = LF();
        }
        return res;
    }

    private static String[] SR(int n) throws IOException {
        String[] res = new String[n];
        for (int i = 0; i < n; i++) {
            res[i] = stdin.readLine().trim();
        }
        return res;
    }

    // Methods
    private static void A() throws IOException {
        String s = stdin.readLine();
        long a = s.chars().filter(ch -> ch == '-').count();
        long b = s.chars().filter(ch -> ch == '+').count();
        System.out.println(b - a);
    }

    private static void B() throws IOException {
        char[] n = stdin.readLine().toCharArray();
        int num = Arrays.stream(n).map(ch -> ch - '0').sum();
        int nAsInt = Integer.parseInt(new String(n));
        System.out.println(nAsInt % num == 0 ? "Yes" : "No");
    }

    private static void C() throws IOException {
        int[] input = LI();
        int n = input[0], k = input[1];
        LI(); // Skipping as the original code does not use this list
        System.out.println((n - k) / (k - 1) + 1 + ((n - k) % (k - 1) > 0 ? 1 : 0));
    }

    private static double Sunuke(long a) {
        long sum = String.valueOf(a).chars().mapToLong(ch -> ch - '0').sum();
        return (double) a / sum;
    }

    private static boolean Check(long a, long i) {
        return Sunuke(a + (long) Math.pow(10, i)) > Sunuke(a + (long) Math.pow(10, i + 1));
    }

    private static void D() throws IOException {
        long K = II();
        long ans = 1;
        long i = 0;
        while (K > 0) {
            System.out.println(ans);
            K--;
            if (Check(ans, i)) {
                i++;
            }
            ans += (long) Math.pow(10, i);
        }
    }

    // Solve
    public static void main(String[] args) throws IOException {
        D();
    }
}
```

Remember that this translation does not replicate the exact behavior of the ad-hoc Python code, particularly error handling which is significantly different between Python and Java. Java may throw exceptions in cases where Python would not, such as when parsing integers from input, and therefore explicit exception handling is required.

Also, note that Java code must be properly encapsulated in classes, and static methods are used to replicate the module-level functions of Python. The `stdin` reader is created to replicate the behavior of reading from `sys.stdin` in Python, and `System.out.println` is used for standard output. The naming conventions of the methods and variables have been preserved as much as possible.
