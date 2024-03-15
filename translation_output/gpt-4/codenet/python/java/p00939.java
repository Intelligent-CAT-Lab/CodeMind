Below is the translated Java code from the provided Python code. Java does not support the same syntax for list comprehensions or tuples as Python, and Java requires explicit type conversions and variable declarations. Moreover, Java's approach to input and output is different from Python, so you'll see that we use `Scanner` for reading input and `System.out.println` for printing output.

Additionally, since Java is statically typed, I've used appropriate data types and created utility functions for summing arrays and computing the product with increments. Please note that Java methods do not support closures in the same way Python's functions do, so I've handled the memoization through class variables and passed indices to recursive calls instead.

```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static int[] DI;
    private static int N;
    private static int pd;
    private static Map<String, Integer>[] memo;
    private static Map<String, Integer>[] memo1;

    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner sc = new Scanner(System.in);
        String D = sc.nextLine();
        N = D.length();
        DI = new int[N];

        for(int i = 0; i < N; i++){
            DI[i] = Character.getNumericValue(D.charAt(i));
        }

        int su = sumArray(DI);
        pd = 1;
        for (int d : DI) {
            pd *= (d + 1);
        }

        memo = new HashMap[N];
        for (int i = 0; i < N; i++) memo[i] = new HashMap<>();

        int res1 = dfs0(0, su, 1);

        memo1 = new HashMap[N];
        for (int i = 0; i < N; i++) memo1[i] = new HashMap<>();

        int res2 = dfs1(0, su, pd, 0) - 1;

        int ans = res1 + res2;

        System.out.println(ans);
        sc.close();
    }

    private static int dfs0(int i, int s, int p) {
        String key = s + "_" + p;
        if (i == N) {
            return s > 0 || (s == 0 && p < pd) ? 1 : 0;
        }
        if (memo[i].containsKey(key)) {
            return memo[i].get(key);
        }
        int r = 0;
        for (int v = 0; v <= Math.min(s, 9); v++) {
            r += dfs0(i + 1, s - v, p * (v + 1));
        }
        memo[i].put(key, r);
        return r;
    }

    private static int dfs1(int i, int s, int p, int m) {
        String key = s + "_" + p + "_" + m;
        if (i == N) {
            return (s == 0 && p == 1) ? 1 : 0;
        }
        if (memo1[i].containsKey(key)) {
            return memo1[i].get(key);
        }
        int r = 0;
        int b = s - (N - 1 - i) * 9;
        int di = DI[i];
        for (int v = Math.max(b, 0); v <= Math.min(s, 9); v++) {
            if (p % (v + 1) != 0) {
                continue;
            }
            if (m == 0) {
                if (di < v) {
                    break;
                }
                r += dfs1(i + 1, s - v, p / (v + 1), +(v < di ? 1 : 0));
            } else {
                r += dfs1(i + 1, s - v, p / (v + 1), 1);
            }
        }
        memo1[i].put(key, r);
        return r;
    }

    private static int sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }
}
```

Be sure to run this code within a class context, and remember Java uses a different mechanism for execution, requiring a `main` method. This might not be the correct Java translation if the original code has specific context or dependencies outside of this snippet.
