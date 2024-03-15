Here's the equivalent Java code for the Python code snippet you provided:

```java
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: "); // Prompt for input in Java
        int n = scanner.nextInt();
        scanner.close();

        long k = 1; // Use long in case of large factorials
        for(int j = 1; j <= n; j++) {
            k *= j;
        }

        System.out.println(k);
    }
}
```
Please note that in Java, we need to use a `Scanner` to read input from the console, and we generally define a `main` method inside a class to run our program. Also, I've used `long` to store the factorial result because the factorial of an integer can quickly exceed the range of an `int` in Java. If you know that the input will not be very large, you can use `int` instead.
