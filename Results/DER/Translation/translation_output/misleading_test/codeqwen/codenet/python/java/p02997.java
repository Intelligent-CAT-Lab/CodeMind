Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        if (K > ((N - 1) * (N - 2)) / 2) {
            System.out.println(-1);
            return;
        }

        System.out.println(N - 1 + ((N - 1) * (N - 2)) / 2 - K);

        for (int i = 2; i <= N; i++) {
            System.out.println(1 + " " + i);
        }

        int a = 0;
        for (int i = 2; i < N; i++) {
            for (int j = i + 1; j <= N; j++) {
                if (a < ((N - 1) * (N - 2)) / 2 - K) {
                    System.out.println(i + " " + j);
                    a += 1;
                }
            }
        }
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the result, and prints it to the standard output. The main difference is that Java uses `Scanner` to read input instead of `sys.stdin.readline().rstrip().split()`.
