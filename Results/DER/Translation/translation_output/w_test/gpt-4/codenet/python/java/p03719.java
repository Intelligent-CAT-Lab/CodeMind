Below is the translated Java code from the given Python code:

```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Read input
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // Check condition
        if (B >= C && C >= A) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
```

Note that the translation provided here only includes the `main` function from the original Python code, as the other functions (such as `to_bin`, `gcd`, etc.) are not used in the logic to produce the expected output. Furthermore, Java uses built-in methods for tasks such as GCD (math.gcd is available in some libraries) or combinatorics, and would not typically reimplement these unless necessary for a specific use case.

To run the Java program with the test input `1 3 2` and get the expected output `Yes`, you can compile the Java program and pass the input as command line arguments or modify main to use hardcoded values, depending on how input is meant to be provided to the program.
