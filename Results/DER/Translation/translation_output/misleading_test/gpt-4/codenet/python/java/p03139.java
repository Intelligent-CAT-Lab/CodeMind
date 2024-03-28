Here is the equivalent Java code to perform the same operation as the provided Python code, including reading input from standard input and printing output to standard output:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(Math.min(A, B) + " " + Math.max(A + B - N, 0));
    }
}
```

Please note that this Java code assumes that the class name is `Main`, and it includes necessary imports and the `main` method that is the entry point for Java programs. The `Scanner` is used to read input, similar to the `input().split()` in Python, and `Math.min()` and `Math.max()` methods are used just like `min()` and `max()` functions in Python.
