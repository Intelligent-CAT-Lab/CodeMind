Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println(-(-n/(2*d+1)));
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, calculates the result of the expression `-(-n/(2*d+1))`, and prints the result. The `Scanner` class is used to read input from the user. The `-(-n/(2*d+1))` expression is equivalent to `n/(2*d+1)` when `n` is positive, and `-(n/(2*d+1))` when `n` is negative. This is because the unary `-` operator has higher precedence than the binary `/` operator, so the expression is evaluated as `-(n/(2*d+1))`.
