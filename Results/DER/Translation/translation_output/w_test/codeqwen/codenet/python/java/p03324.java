Here is the Java equivalent of the Python code you provided:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int D = scanner.nextInt();
        int N = scanner.nextInt();
        if (N != 100) {
            System.out.println(100 * Math.pow(10, D) * N);
        } else {
            System.out.println(100 * Math.pow(10, D) * (N + 1));
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the result, and prints it. The `Math.pow` function is used to raise 10 to the power of `D`.
