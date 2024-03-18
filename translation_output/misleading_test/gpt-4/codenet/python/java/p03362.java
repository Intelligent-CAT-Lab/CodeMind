Here is the translated Java code:

```java
import java.io.*;
import java.util.*;

public class Main {

    public static final int INF = Integer.MAX_VALUE;
    public static final int MOD = 1000000007;

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

    private static int ni() throws IOException {
        return Integer.parseInt(reader.readLine().trim());
    }

    public static void main(String[] args) throws IOException {
        new Main().main();
        reader.close();
        writer.close();
    }

    public void main() throws IOException {
        List<Integer> p = makePrimeNumbers(2000);

        int n = ni();
        List<Integer> ans = new ArrayList<>();

        for (int pi : p) {
            if (pi % 10 == 1) {
                ans.add(pi);
            }
            if (ans.size() == n) {
                break;
            }
        }

        for (int i = 0; i < ans.size(); i++) {
            writer.write(ans.get(i).toString());
            if (i < ans.size() - 1) {
                writer.write(" ");
            }
        }

        writer.newLine();
        writer.flush();
    }

    // Generate a list of prime numbers up to n
    private List<Integer> makePrimeNumbers(int n) {
        List<Integer> primeNumbers = new ArrayList<>();
        if (n >= 2) {
            primeNumbers.add(2);
        }
        outerLoop:
        for (int i = 3; i <= n; i += 2) { // Only checking odd numbers
            int sqrtI = (int) Math.sqrt(i);
            for (int p : primeNumbers) {
                if (p > sqrtI) {
                    primeNumbers.add(i);
                    continue outerLoop;
                }
                if (i % p == 0) {
                    continue outerLoop;
                }
            }
        }
        return primeNumbers;
    }
}
```

Please note the following:
1. The translated Java code requires you to handle IOException as I/O operations in Java can throw this exception.
2. The prime number generation method in the Java code is improved to skip even numbers as they are not prime (except for 2).
3. The main method has been modified to be non-static.

Make sure your Java environment is correctly set up to run the translated code and consider changing the input method if necessary (e.g., using Scanner instead of BufferedReader). Since the original code reads from standard input, the Java code is designed to do the same. However, you may need to modify it for specific IDE or command line use.

Additionally, the code will write the output to standard output (console), which you can check after running the Java program.
