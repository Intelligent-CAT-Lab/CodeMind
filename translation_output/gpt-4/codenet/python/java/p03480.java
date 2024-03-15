Below is the translation of the given Python code into Java. The Java code reads a string from the standard input and then calculates a specific value, which is printed to the standard output. Please note that Java handles input and output differently compared to Python, so I've used the `Scanner` class for input and `System.out` for output. Additionally, there are no built-in "infinity" values for integers in Java, so the maximum integer value is used as a substitute for `inf`.

```java
import java.util.Scanner;

public class ABC83D {

    // Define "infinity" as the maximum integer value
    public static final int INF = Integer.MAX_VALUE;
    public static final long MOD = (long)1e9 + 7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read a string from the input
        String s = sc.next();
        int n = s.length();

        // Initialize the result with "infinity"
        int res = INF;

        // Iterate through the characters of the string
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                res = Math.min(res, Math.max(n - i - 1, i + 1));
            }
        }

        // Check for the special case and print the result
        if (res == INF) {
            System.out.println(n);
        } else {
            System.out.println(res);
        }

        sc.close(); // Close the scanner
    }
}
```

Please make sure to compile and run this code in an environment where Java is properly set up and where you can provide input to `System.in`.
