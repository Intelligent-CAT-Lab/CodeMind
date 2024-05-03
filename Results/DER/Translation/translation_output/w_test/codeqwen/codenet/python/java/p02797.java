Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int S = scanner.nextInt();

        int[] A = new int[N];
        if (S == 1000000000) {
            for (int i = 0; i < N - K; i++) {
                A[i] = S - 1;
            }
        } else {
            for (int i = 0; i < N - K; i++) {
                A[i] = 1000000000;
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.print(A[i] + (i < N - 1 ? " " : ""));
        }
    }
}
```

This Java code does the same thing as your Python code. It reads three integers N, K, and S from the standard input, creates an array A of size N, and fills it with the appropriate values. Then it prints the elements of A, separated by spaces.
