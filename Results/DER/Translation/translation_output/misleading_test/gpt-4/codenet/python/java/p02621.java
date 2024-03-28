Here is the equivalent code in Java that performs the same operations as the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(a + (int)Math.pow(a, 2) + (int)Math.pow(a, 3));
    }
}
```

This Java code imports the `Scanner` class, which is used to read inputs from the system. When running the program, it behaves similarly to the original Python code provided: it waits for an integer input and then outputs the sum of `a`, `a` squared, and `a` cubed as per the provided expression.
