Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N % 2 == 0) {
            System.out.println(0.5);
        } else {
            System.out.println((double) (N + 1) / N / 2);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, checks if it's even or odd, and then prints the appropriate result. The `(double)` cast is necessary because Java's division operator `/` performs integer division when both operands are integers. By casting one of the operands to `double`, we ensure that the division is performed as floating-point division.
