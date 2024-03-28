Here is the translated Java code including the logic for taking input from the user:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(sum(ij((int)Math.sqrt(n))) - 2);
        scanner.close();
    }

    static int[] ij(int x) {
        for (int i = x; i > 0; i--) {
            if (n / i == n / (double) i) {
                return new int[]{i, n / i};
            }
        }
        return null;  // This line will never be reached with the current logic.
    }

    static int sum(int[] array) {
        return array[0] + array[1];
    }
}
```

Please note that I have enclosed the main logic into a main class named `Main` and that we need to initialize the `Scanner` object to read from standard input. The `ij` function now returns an array of integers, and the `sum` function has been refactored to take an array and add its elements.

Make sure to compile (`javac Main.java`) and run (`java Main`) the Java code. It is also important to handle any edge cases not covered by this straightforward port from Python to Java and ensure that we close the `Scanner` instance after use to avoid resource leaks.
