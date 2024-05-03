Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if (Math.max(N, M) == 1) {
            System.out.println(1);
        } else if (Math.min(N, M) == 1) {
            System.out.println(N * M - 2);
        } else {
            System.out.println((N - 2) * (M - 2));
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, then checks if the maximum of the two numbers is 1, the minimum of the two numbers is 1, or neither. If the maximum is 1, it prints 1. If the minimum is 1, it prints `N*M - 2`. Otherwise, it prints `(N-2)*(M-2)`.
