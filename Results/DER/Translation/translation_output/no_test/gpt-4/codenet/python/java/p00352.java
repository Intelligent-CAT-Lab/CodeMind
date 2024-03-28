Here is the equivalent Java code for the given Python snippet:

```java
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read two integer inputs
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Calculate and print the integer average of the two numbers
        System.out.println((a + b) / 2);

        sc.close();
    }
}
```

This Java program does the following:
1. Imports the `Scanner` class for taking input from the user.
2. Declares a `public` class named `AverageCalculator`.
3. Inside the `main` method, it creates an instance of `Scanner` to read input from `System.in`.
4. Reads two integer values `a` and `b` from the user input.
5. Calculates the average of `a` and `b` assuming integer division (just as `//` does in Python).
6. Prints out the result.
7. Closes the scanner to prevent resource leaks.
