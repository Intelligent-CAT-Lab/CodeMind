Here is the translated Java code for the Python script provided:

```java
import java.io.*;
import java.util.*;
import java.math.*;

public class Main {
    private static final int MOD = 1000000007;

    private static int solve(int N, int K) {
        ArrayList<Integer> ns = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N < i * i) {
                break;
            }
            ns.add(i);
            if (i != N / i) {
                ns.add(N / i);
            }
        }
        Collections.sort(ns);
        LinkedHashSet<Integer> nsSet = new LinkedHashSet<>(ns);
        ns = new ArrayList<>(nsSet); // Remove duplicates and preserve order

        Map<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < ns.size(); i++) {
            m.put(ns.get(i), i);
        }

        int[] l = new int[ns.size()];
        for (int i = 0; i < ns.size() - 1; i++) {
            int s = ns.get(i);
            int b = ns.get(i + 1);
            l[i] = (N / s) - (N / b);
        }
        l[ns.size()-1] = 1;

        int[][] dp = new int[K + 1][ns.size()];
        dp[0][m.get(N)] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
                dp[i][j] %= MOD;
            }
            for (int j = 0; j < ns.size(); j++) {
                int nn = ns.get(j);
                int nj = m.get(N / nn);
                dp[i + 1][j] = (int)(((long)dp[i + 1][j] + (long)dp[i][nj] * l[j]) % MOD);
            }
        }

        long sum = 0;
        for (int i = 0; i < ns.size(); i++) {
            sum = (sum + dp[K][i]) % MOD;
        }
        return (int)sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int result = solve(N, K);
        System.out.println(result);
    }
}
```
In the code above, `Scanner` is used to read input similar to `sys.stdin` in Python, and I've handled Java's type differences, such as converting long to int for the `dp[][]` array and using `ArrayList` instead of a dynamic list from Python. Additionally, I've replaced the Python `%` operator with explicit mod operations and accounted for the lack of first-class functions in Java (e.g., there is no direct Java equivalent to Python's `next()` generator function, so a `Scanner` object is used instead).

The program should be compiled with `javac Main.java` and then run with `java Main`, taking input from `stdin` similar to the Python script.
