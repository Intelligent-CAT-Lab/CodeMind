Below is the equivalent Java code for the given Python code. Since Java is statically typed, you need to make sure to declare the types for each variable and parameter. Also, Java method names should follow the camelCase naming convention. 

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = 998244353;

    private static long[] getInv(int N) {
        long[] inv = new long[N + 1];
        inv[1] = 1;
        for (int i = 2; i <= N; i++) {
            inv[i] = (-(MOD / i) * inv[MOD % i]) % MOD;
            inv[i] = (inv[i] + MOD) % MOD;
        }
        return inv;
    }

    private static long[] getCmb(int N) {
        long[] inv = getInv(N);
        long[] nCr = new long[N + 1];
        nCr[0] = 1;
        
        for (int i = 1; i <= N; i++) {
            nCr[i] = (nCr[i - 1] * (N - i + 1) * inv[i]) % MOD;
        }
        
        return nCr;
    }

    private static long solve(int N, int A, int B, int K) {
        long ans = 0;
        long[] nCr = getCmb(N);
        for (int a = 0; a <= N; a++) {
            int b = (K - A * a) / B;
            if (b >= 0 && b <= N && A * a + B * b == K) {
                ans += (nCr[a] * nCr[b]) % MOD;
                ans %= MOD;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int A = input.nextInt();
        int B = input.nextInt();
        int K = input.nextInt();
        input.close();
        
        System.out.println(solve(N, A, B, K));
    }
}
```

This Java code snippet includes a `main` method for reading from standard input and a `solve` method, along with two helper methods (`getInv` and `getCmb`) just like the provided Python example. The main functionality and logic of your Python code are preserved in the Java translation. Make sure to compile and run the above code with the appropriate Java version, which should be Java SE 7 or later to support features like the try-with-resources statement for the Scanner.
