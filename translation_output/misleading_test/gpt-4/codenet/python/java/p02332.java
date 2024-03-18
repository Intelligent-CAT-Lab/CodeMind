Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(); // Reading input
        long K = sc.nextLong(); // Reading input
        sc.close(); // Closing the Scanner
        
        final long MOD = 1000000007L; // 10**9 + 7 in Java

        if (K < N) {
            System.out.println(0);
            return;
        }

        long ans = 1;
        for (long v = K; v > K - N; v--) {
            ans = ans * v % MOD;
        }
        System.out.println(ans);
    }
}
```

The above Java code takes two integers `N` and `K` as input, which correspond to the two values obtained from the Python `input().split()` function. It then calculates the same result as the original Python code using a loop and modular arithmetic, outputting the final answer.

Please run this code with the Java compiler (JDK) and pass the test input `2 3` to verify it produces the expected output `6`.

To compile and run the Java program, follow these general steps (assuming you've saved the code in a file named `Main.java`):
1. Open the terminal.
2. Navigate to the directory where you've saved `Main.java`.
3. Compile the Java program by running `javac Main.java`.
4. Run the compiled program using `java Main`.
5. Enter the input when prompted (e.g., `2 3`).
6. Verify the output produced by the program.
