Here is the Java version of your Python code:

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

This Java code does the same thing as your Python code. It reads two integers N and K from the standard input, checks if K is greater than the number of possible edges in a graph with N nodes, and if so, prints -1 and exits. Otherwise, it prints the number of edges in the graph, followed by the edges themselves.
