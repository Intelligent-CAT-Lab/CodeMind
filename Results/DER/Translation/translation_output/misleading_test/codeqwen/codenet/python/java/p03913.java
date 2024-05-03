Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int A = scanner.nextInt();

        int answer = Integer.MAX_VALUE;
        for (int K = 1; K < 50; K++) {
            answer = Math.min(answer, F(N, A, K));
        }
        System.out.println(answer);
    }

    private static int F(int N, int A, int K) {
        // x+y = K
        // n^K <= N < (n+1)^K
        int n = (int) Math.pow(N, 1.0 / K);
        while (n * Math.pow(n - 1, K - 1) > N) {
            n--;
        }
        while (n * Math.pow(n + 1, K - 1) < N) {
            n++;
        }
        // n^x(n+1)^y >= N, yãæå°ã«ã¨ããé¢åãªã®ã§å¨æ¢ç´¢
        for (int y = 0; y < K; y++) {
            int x = K - y;
            if (Math.pow(n, x) * Math.pow(n + 1, y) >= N) {
                break;
            }
        }
        int cost = A * (K - 1) + n * x + (n + 1) * y;
        return cost;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers N and A from the standard input, then calculates the minimum cost for each possible value of K from 1 to 49 (inclusive) and prints the minimum cost. The F function is the same as the Python function, but it takes three arguments instead of two.
