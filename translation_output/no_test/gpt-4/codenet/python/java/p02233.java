Here is the translation of the given Python code into Java:

```java
import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 1;
        int b = 1;
        int i = 0;
        while (i < n) {
            int temp = a;
            a = b;
            b = temp + b;
            i++;
        }
        System.out.println(a);
        scanner.close();
    }
}
```

The Java code above does the same thing as the Python code you provided: it reads an integer `n` from the user and computes the `n`-th number in the Fibonacci sequence, starting with `1, 1, 2, 3, 5, ...`, then prints it to the console. Note that in Java, you have to declare types for variables, such as `int` for integer numbers, and you also need to close the `Scanner` resource to avoid resource leaks.
