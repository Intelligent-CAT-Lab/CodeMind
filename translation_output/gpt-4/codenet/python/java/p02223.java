Here's the equivalent Java code for the Python code provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println("1\n0");
        } else if (n == 2) {
            System.out.println("2\n0\n11");
        } else {
            System.out.println(n - 1);
            for (int i = 0; i < n - 1; i++) {
                System.out.print("1");
                for (int j = 0; j < i; j++) {
                    System.out.print("0");
                }
                System.out.println("1");
            }
        }

        scanner.close();
    }
}
```

Note that there are a few differences between Python and Java that require attention:
1. Java requires the definition of a class and a main method for a program to run.
2. Instead of `input()`, Java uses a `Scanner` object to read input from the user.
3. Java is strongly typed, so we need to specify the type of `n` as `int`.
4. Java uses `System.out.println` for printing to the console.
5. Java uses `nextInt()` to read an integer from the input.
6. The `xrange` function doesn't exist in Java. Instead, Java uses a regular `for` loop.

Make sure to include error handling and input validation as per requirements in a production environment.
