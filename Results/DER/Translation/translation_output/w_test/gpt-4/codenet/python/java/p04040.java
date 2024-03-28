Below is the Python code translated into Java. The COMB_MOD class in Python is translated into a Java class named `CombMod`, preserving the same functionality and the precomputation of factorials and inverses. The main function reads the input, creates an instance of `CombMod`, and calculates the answer as specified.

```java
import java.util.Scanner;

public class Main {
    static final int MOD = (int)1e9 + 7;

    static class CombMod {
        long[] fac, finv, inv;
        int max;
        long mod;

        public CombMod(int max_n, long mod) {
            this.fac = new long[max_n];
            this.finv = new long[max_n];
            this.inv = new long[max_n];
            this.max = max_n;
            this.mod = mod;

            this.fac[0] = this.fac[1] = 1;
            this.finv[0] = this.finv[1] = 1;
            this.inv[1] = 1;
            
            preProcess();
        }

        private void preProcess() {
            for (int i = 2; i < this.max; i++) {
                this.fac[i] = this.fac[i - 1] * i % this.mod;
                this.inv[i] = this.mod - this.inv[(int)(this.mod % i)] * (this.mod / i) % this.mod;
                this.finv[i] = this.finv[i - 1] * this.inv[i] % this.mod;
            }
        }

        public long comb(int n, int k) {
            if (n < k) return 0;
            if (n < 0 || k < 0) return 0;
            return this.fac[n] * (this.finv[k] * this.finv[n - k] % this.mod) % this.mod;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        CombMod C = new CombMod(2 * 100000, MOD);

        long ans = 0;
        for (int i = 0; i < h - a; i++) {
            ans = (ans + C.comb(b - 1 + i, i) * C.comb(h - 1 - i + w - 1 - b, h - 1 - i)) % MOD;
        }

        System.out.println(ans);
        scanner.close();
    }
}
```

This Java program should be compiled and run with JDK installed. Given the input of "2 3 1 1", this program should print the expected output "2" as this is the translated behavior of the original Python code.
