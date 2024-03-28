Below is the translated Java code for the provided Python script:

```java
import java.util.*;
import java.io.*;

public class Main {
    static final long MOD = 1000000007L;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokens = new StringTokenizer(reader.readLine());
        int N = Integer.parseInt(tokens.nextToken());
        int K = Integer.parseInt(tokens.nextToken());
        long result = solve(N, K);
        System.out.println(result);
    }

    private static long solve(int N, int K) {
        ArrayList<Integer> ns = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            if (N < i * i) break;
            ns.add(i);
            if (i != N / i) {
                ns.add(N / i);
            }
        }
        Collections.sort(ns);
        HashMap<Integer, Integer> m = new HashMap<>();
        for (int i = 0; i < ns.size(); i++) {
            m.put(ns.get(i), i);
        }

        int[] l = new int[ns.size()];
        for (int i = 0; i < ns.size() - 1; i++) {
            l[i] = (N / ns.get(i)) - (N / ns.get(i + 1));
        }
        l[ns.size() - 1] = 1;

        long[][] dp = new long[K + 1][ns.size()];
        dp[0][m.get(N)] = 1;

        for (int i = 0; i < K; i++) {
            for (int j = ns.size() - 2; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1];
                dp[i][j] %= MOD;
            }
            for (int j = 0; j < ns.size(); j++) {
                int nj = m.get(N / ns.get(j));
                dp[i + 1][j] = (dp[i + 1][j] + dp[i][nj] * l[j]) % MOD;
            }
        }

        long sum = 0;
        for (int i = 0; i < ns.size(); i++) {
            sum += dp[K][i];
            sum %= MOD;
        }
        return sum;
    }
}
```

Note: 
- I have used `BufferedReader` and `StringTokenizer` to handle the input, which is more efficient and common in Java.
- Java does not have a built-in gcd function for integers, but it's not required in the provided problem-solving function; hence, I did not include it.
- I replaced the Python dictionary `m` with a Java `HashMap`.
- Dynamic arrays are represented by `ArrayList` in Java.
- The for-each loop is not used since we often need the index or need to iterate backward, unlike the Python version.
- Modulus operations are frequently applied to ensure the value never becomes negative due to long overflow.
- This Java code assumes that the input will be provided in the same format as described in the Python code. If you are running it in a different context (like a file or command line arguments), you will need to modify the input-handling section.
- Since there is no built-in way to handle arbitrary-length integer arrays in Java, long arrays are used for `dp` to avoid overflow when multiplying the two integers.
