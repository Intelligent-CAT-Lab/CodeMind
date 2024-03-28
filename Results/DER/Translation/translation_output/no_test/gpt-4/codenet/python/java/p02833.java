Here's the Java translation of the provided Python code:

```java
import java.util.Scanner;
import java.math.BigInteger;
import java.util.stream.IntStream;

public class Main {
    // Importing Libraries
    static final int MAX = 100001;
    static int[] par = new int[MAX];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initial setup of DSU
        for (int i = 0; i < MAX; i++) {
            par[i] = -1;
        }

        // User defined functions
        int t = 1; // If t should be read from input, replace with t = rd(1, sc);

        for (int term = 1; term <= t; term++) {
            int n = rd(1, sc); // Reading the value of 'n'
            int div = 10;
            int tot = 0;
            
            if (n % 2 == 1) {
                System.out.println(0);
            } else {
                while (n >= div) {
                    // System.out.println(n / div); // Debug print, uncomment if necessary
                    tot += (n / div);
                    div *= 5;
                }
                System.out.println(tot);
            }
        }

        sc.close(); // Close the Scanner
    }

    // NCR function
    public static BigInteger ncr(int n, int r) {
        r = Math.min(r, n - r);
        BigInteger numer = IntStream.rangeClosed(n - r + 1, n)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        BigInteger denom = IntStream.rangeClosed(1, r)
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply);
        return numer.divide(denom);
    }
    
    // READ function
    public static Object rd(int p, Scanner sc) {
        if (p == 0) {
            return sc.nextLine();
        }
        if (p == 1) {
            return sc.nextInt();
        }
        if (p == 2) {
            return sc.nextLine().split(" ");
        }
        if (p == 3) {
            return sc.nextLine().split(" ");
        }
        return null;
    }
    
    // DSU find function
    public static int find(int u) {
        if (par[u] < 0) {
            return u;
        } else {
            return find(par[u]);
        }
    }
    
    // DSU union function
    public static void uni(int x, int y) {
        int u = find(x);
        int v = find(y);
        if (u == v) {
            return;
        }
        if (par[u] < par[v]) {
            par[u] += par[v];
            par[v] = u;
        } else {
            par[v] += par[u];
            par[u] = v;
        }
    }
}
```

Some notes on the translation:
- Java does not directly support tuples as in Python, so I've used `Object` as the return type for the `rd` method, which is not perfect, but may suffice for the high-level translation shown here.
- Similarly, `BigInteger` is used for computing combinations `ncr` to cope with potential integer overflow.
- Instead of raising an error for unexpected input to the `rd` function, it returns `null`; you could add additional error handling if needed.
- The DSU operations (`find` and `uni`) are directly translated, but Java requires a different initialization and the syntax differs from Python.
- I've assumed that if the number of test cases `t` needs to be read from input, the comment indicates that the line should be replaced with `t = rd(1, sc);`. However, the `rd` function is not suited for this without a bit of casting.
- Remember that you need to uncomment the relevant sections of the `rd` function to get actual integer arrays or string arrays as needed.
- `import java.util.stream.IntStream;` has been added to replace the `reduce` operation in the `ncr` function from Python.
