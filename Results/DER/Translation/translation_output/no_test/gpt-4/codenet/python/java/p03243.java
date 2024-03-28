Here's the equivalent Java code for the given Python code:

```java
import java.util.Scanner;

public class FindMultipleOf111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int X = 0, P = 0;

        for (int i = 0; i < 10; i++) {
            P = i * 111;
            if (X < N && N <= P) {
                System.out.println(P);
            }
            X = P;
        }

        scanner.close();
    }
}
```

This Java code includes the main class and imports the Scanner class, which is used for handling the input in Java, similar to the `input()` function in Python. The structure of the code is almost identical, with just a few syntax differences to accommodate Java's language rules.
