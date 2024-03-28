Below is the equivalent Java code for the Python code you've provided. The sample test case will need to be handled differently in Java since it does not have a built-in function for reading space-separated values on the same line as Python does. Instead, we can read input using `Scanner` or `BufferedReader` in Java.

Additionally, in Java, instead of the print command, we use `System.out.println` for console output.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read values of N and K from input
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        long count = 0;
        
        for (int i = K + 1; i <= N; i++) {
            count += ((N + 1) / i) * (i - K) + Math.max(0, (N + 1) % i - K);
        }
        
        if (K == 0) {
            count -= (N - K);
        }
        
        System.out.println(count);
    }
}
```

Here's how the java code works:

1. The Java `Scanner` class is imported and used to read the input from the user.
2. A `Main` class is defined with the main method as the entry point for the program.
3. Inside the `main` method, a new `Scanner` object is created to read input from `System.in`.
4. Values for `N` and `K` are read from the user using `scanner.nextInt()`.
5. The `scanner` is closed after reading the input to prevent resource leakage.
6. The variable `count` is declared and initialized to `0`.
7. A for-loop similar to the Python `range` function is created to iterate from `K + 1` to `N`.
8. Inside the loop, the count is incremented with the calculated value using integer division and modulo operations, similar to the Python code.
9. If `K` equals `0`, then the count is decremented by `N - K`.
10. Finally, `System.out.println` is called to output the value of `count`.

To execute the code:
1. Save the code in a file named `Main.java`.
2. Compile it using a Java compiler (e.g., `javac Main.java`).
3. Run the compiled class using the Java interpreter (e.g., `java Main`).
4. When prompted, enter the test input (e.g., `5 2`).
