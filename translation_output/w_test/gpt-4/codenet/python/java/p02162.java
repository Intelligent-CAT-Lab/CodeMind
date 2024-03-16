Here's the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();

        if (r1 == -1 || r2 == -1) {
            if (t1 < t2) {
                System.out.println("Alice");
            } else if (t1 > t2) {
                System.out.println("Bob");
            } else {
                System.out.println("Draw");
            }
        } else if (r1 > r2) {
            System.out.println("Alice");
        } else if (r1 < r2) {
            System.out.println("Bob");
        } else {
            System.out.println("Draw");
        }
        
        scanner.close();
    }
}
```

Let's break down the code:

- Import the Scanner class for taking input from the user.
- Define the `Main` class.
- Define the `main` method as the entry point for the program.
- Create a `Scanner` object to take input from the command line.
- Read four integers `t1`, `t2`, `r1`, and `r2` consecutively from the input.
- Use conditional statements to implement the same logic as given in the Python code.
- Print out the result as per the conditions.
- Close the `Scanner` object to prevent resource leaks.

When you run the Java program and input `9 8 1000 999`, it will print out "Alice" as expected.
