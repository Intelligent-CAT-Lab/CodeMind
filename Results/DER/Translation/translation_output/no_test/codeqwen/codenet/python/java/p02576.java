Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = scanner.nextInt();
        int T = scanner.nextInt();
        scanner.close();

        if (N % X != 0) {
            System.out.println((N / X) * T + T);
        } else {
            System.out.println((N / X) * T);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers N, X, and T from the user, and then checks if N is divisible by X. If it's not, it calculates the result by multiplying N by T and adding T, and then prints the result. If N is divisible by X, it just multiplies N by T and prints the result.
