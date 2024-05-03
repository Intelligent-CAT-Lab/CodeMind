Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int D = scanner.nextInt();
        int x = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            x = r * x - D;
            System.out.println(x);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers from the user, then it enters a loop that runs 10 times. In each iteration, it multiplies the current value of `x` by `r` and subtracts `D`, then it prints the new value of `x`.
