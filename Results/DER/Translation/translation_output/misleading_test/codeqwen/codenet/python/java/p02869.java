Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        if (2 * N * (K + K + 2 * N - 1) > N * (K + 2 * N + K + 3 * N - 1)) {
            System.out.println(-1);
            return;
        }
        boolean[] flag = new boolean[2 * N];
        for (int i = (int) Math.floor(N / 2); i < N; i++) {
            int a = K + i;
            int b = K + 2 * N - 1 - (i - (int) Math.floor(N / 2)) * 2;
            int c = K + 3 * N - 1 - (i - (int) Math.floor(N / 2));
            System.out.println(a + " " + b + " " + c);
        }
        for (int i = 0; i < (int) Math.floor(N / 2); i++) {
            int a = K + i;
            int b = K + 2 * N - 2 - i * 2;
            int c = K + 3 * N - 1 - i - (int) Math.ceil(N / 2);
            System.out.println(a + " " + b + " " + c);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads two integers N and K from the standard input, and then it checks if the condition `2 * N * (K + K + 2 * N - 1) > N * (K + 2 * N + K + 3 * N - 1)` is true. If it is, it prints -1 and exits. Otherwise, it prints three integers a, b, and c for each i from 0 to N-1, and then from N to 2*N-1.
