Here is the translated code from Python to Java:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Collections;

public class Main {
    public static final int MOD = 1000000007;
    public static final double INF = Double.POSITIVE_INFINITY;
    public static FastScanner sc = new FastScanner();
    
    public static void main(String[] args) {
        solve();
    }
    
    public static void solve() {
        int n = sc.nextInt();
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            int x = n / i;
            ans += i * (1L + x) * x / 2;
        }
        System.out.println(ans);
    }
    
    // Fast input reader
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
```

Things to note:
- I converted helper functions like `LI`, `II` into reading inputs directly using a custom `FastScanner` class in Java for efficient IO, inspired by the way `input()` is redefined in the given Python code.
- In Java, we must define all code within a class, and our program's entry point is the `main` method.
- I've translated the `solve` method directly, calculating `ans` in the same manner.
- In Java, you need to be careful with integer division and multiplication to avoid integer overflow. I used `1L` to ensure that the multiplication result is treated as a long integer.
- The `MOD` and `INF` constants remain the same, although `INF` is used for double values, not floats, in Java. The `float` keyword wasn't used in the original code block, so I stayed consistent with double precision.
- The use of heapq and bisect functions, along with `defaultdict` and `deque`, weren't directly translated because they are not utilized in the `solve` function.
- I omitted the recursion limit setting since Java manages this differently and it wasn’t relevant to the `solve` method.
- The translated Java code does not require importing `Arrays`, `PriorityQueue`, and `Collections` as original Python code imports are not directly used in the `solve` function. However, if the rest of your program requires similar functionality, you would import and implement these classes accordingly.
