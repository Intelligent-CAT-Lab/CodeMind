Here's the equivalent Java code for the Python snippet you've provided:

```java
import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();

        int result = N - (K - 1);
        System.out.println(result);

        scanner.close();
    }
}
```

This Java program will read two integers `N` and `K` separated by a space from the standard input, similar to how the Python code reads it using `input().split()`. It then performs the subtraction as in the Python code and prints the result.
