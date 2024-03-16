Here's the equivalent Java code that takes an integer input from the user and performs the same operation as your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((n + 1) & -(n + 1));
        scanner.close();
    }
}
```

Explanation:
- We import `Scanner` from `java.util` to take input from the user.
- Inside the `main` method, we create a `Scanner` object to read the integer value.
- We then perform the bitwise operation as in the Python code which involves adding 1 to the input number and then performing a bitwise AND operation with the negation of that number.
- Finally, we close the scanner to prevent resource leaks.
