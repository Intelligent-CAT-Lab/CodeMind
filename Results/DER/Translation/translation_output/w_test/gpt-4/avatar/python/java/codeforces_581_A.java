Here's a Java translation of the Python code provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        // Convert input to integers
        int[] x = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            x[i] = Integer.parseInt(input[i]);
        }

        // Assign a and b
        int a = x[0];
        int b = x[1];

        // Find and print minimum
        System.out.print(Math.min(a, b) + " â–ˆ ");

        // Compute and print the other value
        if (Math.abs(a - b) >= 2) {
            System.out.println(Math.abs(a - b) / 2);
        } else {
            System.out.println(0);
        }

        scanner.close();
    }
}
```

In this code, I replaced the input function with a Scanner to read from standard input in Java. The `print` function has been replaced with `System.out.print` or `System.out.println` for printing. The integer division and absolute difference operations (`//` and `abs` in Python) have their direct counterparts in Java (`/` for integer division and `Math.abs` for the absolute value).

I also added the necessary imports and wrapped the Java code in a `Main` class with a `main` method, which is the Java entry point for program execution.

Please note the `â–ˆ` character in the print statement. I've kept it as is from the original code assuming it was intentional, although it's not a typical character to use in console output. If it is supposed to represent space or any other character, it should be replaced accordingly.
