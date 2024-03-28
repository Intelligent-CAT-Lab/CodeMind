Here's the Python code translated into Java, with the test case included as a main method:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int MOD = 1000000007;
        long ans = 0;

        // l has <= 7 digits
        int r = 1;
        int tot = 1;
        for (int l = 1; l < 10000000; l++) {
            while (tot < S) {
                r++;
                tot += Integer.toString(r).length();
            }
            if (tot == S) ans++;
            tot -= Integer.toString(l).length();
        }

        // l has > 7 digits
        for (int cnt = 1; cnt <= S; cnt++) {
            int d = S / cnt;
            int m = S % cnt;
            if (d <= 7) break;
            if (m > 0) ans++;
            else ans = (ans + power(10, d, MOD) - power(10, d - 1, MOD) - cnt + 1) % MOD;
            ans %= MOD;
        }
        
        System.out.println(ans);
    }

    private static long power(long base, int exponent, long mod) {
        long result = 1;
        base %= mod;
        while (exponent > 0) {
            if ((exponent & 1) == 1) result = (result * base) % mod;
            exponent >>= 1;
            base = (base * base) % mod;
        }
        return result;
    }
}
```

To compile and run the Java program, you can do as follows:

1. Save the code into a file called `Main.java`.
2. Open a terminal and navigate to the directory where the file is saved.
3. Compile the code with `javac Main.java`.
4. Run the compiled code with `java Main`.
5. You'll be prompted to enter an integer (the `S` from the sample test case). Enter `1` and press Enter to see the expected output `9`.
