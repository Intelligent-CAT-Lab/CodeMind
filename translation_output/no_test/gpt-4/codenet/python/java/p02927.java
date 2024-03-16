Certainly! Below is the translation of your Python code into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        scanner.close();

        int ans = 0;

        for (int i = 22; i <= d; i++) {
            int d0 = i % 10;
            int d1 = i / 10;

            if (d0 == 1 || d0 == 0) {
                continue;
            }

            if (m >= d0 * d1) {
                ans++;
                // System.out.println(i); // Uncomment to print the value of 'i'
            }
        }

        System.out.println(ans);
    }
}
```

Be sure to take note of the differences between Java and Python, including type declarations, usage of the `Scanner` class for input, and integer division. In the Java code, I used a `Scanner` instance to read the two integers that are equivalent to the Python `input().split()` function. Remember to close the scanner after use to prevent resource leaks. Also, Java performs integer division natively when dividing two integers, which aligns with the Python 3 behavior of `int(i/10)`.

I've commented out the equivalent `System.out.println(i);` statement, which you can uncomment if you wish to print the value of 'i' for each iteration where the condition is met, similar to the Python version.
