Below is the Java translation of the given Python code, which reads an integer from standard input, calculates the value of `(n-1)//2`, and prints it out:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Reading integer input from the user
        int n = scanner.nextInt();
        // Calculating and printing the result
        System.out.println((n - 1) / 2);
        scanner.close();
    }
}
```

This Java code uses `Scanner` for reading input from the user. The division `/` operator in Java automatically performs integer division when both operands are integers, which is equivalent to the floor division `//` in Python. Therefore, `(n - 1) / 2` will give the same result as `(n-1)//2` in Python when `n` is an integer. The `Scanner` object is closed after its use to prevent resource leaks.
