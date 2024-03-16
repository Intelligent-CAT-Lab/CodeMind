Here's the equivalent Java code that performs the same function as the provided Python code:

```java
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        System.out.println(n <= k ? 1 : 0);
        
        scanner.close();
    }
}
```

In this Java code, we are using the `Scanner` class to read user input. We read two integers `n` and `k` from the standard input, just like the `input().split()` function does in Python. Then we print `1` if `n` is less than or equal to `k`, otherwise we print `0`, making use of the ternary operator for conciseness, similarly to the Python print statement.
