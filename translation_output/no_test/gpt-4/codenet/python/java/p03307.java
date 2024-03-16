Here is the translated code from Python to Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n % 2 == 0) {
            System.out.println(n);
        } else {
            System.out.println(2 * n);
        }
        
        scanner.close();
    }
}
```

This Java code does the following:
- Imports the Scanner class for taking input from the user.
- Defines a public class named `Main` with the `main` method — an entry point for the Java program.
- Inside the `main` method, it creates a `Scanner` object to read an integer input from the user.
- It then checks if the input number `n` is even by using the modulus operator `%` to determine if `n` modulo 2 equals 0.
- If `n` is even, it prints `n`; if `n` is odd, it prints `2 * n`.
- Finally, it closes the `Scanner` object.
