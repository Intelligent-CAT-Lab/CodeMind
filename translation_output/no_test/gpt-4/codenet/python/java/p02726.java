Below is the translated code from Python to Java:

```java
import java.util.Scanner;

public class DistanceCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        int[] ans = new int[n - 1];

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = j - i;
                int b = Math.abs(y - 1 - j) + Math.abs(i - (x - 1)) + 1;
                ans[Math.min(a, b) - 1]++;
            }
        }

        for (int an : ans) {
            System.out.println(an);
        }
    }
}
```

This Java code includes:

1. Importing the `Scanner` class for input.
2. Defining a `DistanceCounter` class and a `main` method.
3. Initializing variables `n`, `x`, and `y` by reading from input using `Scanner`.
4. Declaring and initializing an array `ans` to store the answer with zero values.
5. Using a nested loop to calculate distances according to the Python code logic.
6. Outputting the result to the console with a for-each loop.

Please note that in Java, we need to close the `Scanner` after using it to prevent resource leaks, which is not necessary in Python. Also, array declaration and instantiation in Java are slightly different from Python's list comprehension.
