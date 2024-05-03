Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        if (2 * N <= M) {
            int ans = N + (M - 2 * N) / 4;
            System.out.println(ans);
        } else {
            int ans = M / 2;
            System.out.println(ans);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers from the user, checks if 2 * N is less than or equal to M, and then calculates the answer accordingly. The result is then printed to the console.
