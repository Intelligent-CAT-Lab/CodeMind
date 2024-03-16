Here is the translated Java code based on your Python code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static final int MOD = 1_000_000_007;
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static int ni() throws IOException {
        return Integer.parseInt(br.readLine().trim());
    }

    static double[] nda() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] arr = new double[st.countTokens()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = Double.parseDouble(st.nextToken());
        return arr;
    }

    static int[] nia() throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[st.countTokens()];
        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        return arr;
    }

    static String ns() throws IOException {
        return br.readLine().trim();
    }

    static int[][] makeGrid(int h, int w, int num) {
        int[][] grid = new int[h][w];
        for (int i = 0; i < h; i++)
            for (int j = 0; j < w; j++)
                grid[i][j] = num;
        return grid;
    }

    static List<List<Integer>> makeAdjListD(int n, int[][] edges) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            res.add(new ArrayList<>());
        for (int[] edge : edges) {
            res.get(edge[0]).add(edge[1]);
            res.get(edge[1]).add(edge[0]);
        }
        return res;
    }

    static List<List<Integer>> makeAdjListNonD(int n, int[][] edges) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= n; i++)
            res.add(new ArrayList<>());
        for (int[] edge : edges) {
            res.get(edge[0]).add(edge[1]);
        }
        return res;
    }

    static BigInteger cmb(int n, int r) {
        return factorial(n).divide(factorial(r).multiply(factorial(n - r)));
    }

    static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }

    public static void main(String[] args) throws IOException {
        String[] input = ns().split(" ");
        BigDecimal A = new BigDecimal(input[0]);
        BigDecimal B = new BigDecimal(input[1]);
        BigDecimal result = A.multiply(B).setScale(0, RoundingMode.DOWN);
        System.out.println(result.toBigIntegerExact());
    }
}
```

Please note that in the translated code:

1. Instead of recursion limit, the default stack size in Java is used. There is no direct equivalent in Java for setting recursion limits as it's determined by the JVM and OS.
2. `MOD` is declared as a constant. The literal `1_000_000_007` here is equivalent to `10 ** 9 + 7` in Python.
3. I/O is handled using `BufferedReader` and `StringTokenizer`. Java's I/O is typically more verbose compared to Python.
4. For `math.factorial`, I used a `BigInteger` to ensure that large numbers are handled correctly. Java doesn't have a built-in factorial method like Python.
5. The main method may throw an `IOException` due to the use of I/O streams. In a real-world application, you'd want to handle this exception more gracefully.
6. `BigDecimal.setScale(0, RoundingMode.DOWN)` is used to mimic Python's behavior when multiplying decimal numbers where it disregards fractional parts without rounding.
7. There is no direct equivalent to Python's `if __name__ == "__main__"` in Java. The `main` method is the entry point of the program.
