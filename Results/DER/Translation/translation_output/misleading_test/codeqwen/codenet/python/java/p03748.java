Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        long[] dp_T = new long[N + 1];
        long[] dp_F = new long[N + 1];
        dp_T[0] = 1;
        dp_F[0] = 0;

        for (int i = 0; i < M; i++) {
            long[] prev_T = dp_T.clone();
            long[] prev_F = dp_F.clone();
            dp_T = new long[N + 1];
            dp_F = new long[N + 1];

            // èµ¤èµ¤
            for (int j = 0; j < N - 1; j++) {
                dp_T[j] = (prev_T[j + 1] + dp_T[j]) % 1000000007;
                dp_F[j] = (prev_F[j + 1] + dp_F[j]) % 1000000007;
            }
            dp_T[0] = (prev_F[1] + dp_T[0]) % 1000000007;

            // èµ¤é
            for (int j = 1; j < N - 1; j++) {
                dp_T[j] = (prev_T[j + 1] + dp_T[j]) % 1000000007;
                dp_F[j] = (prev_F[j + 1] + dp_F[j]) % 1000000007;
            }
            dp_T[1] = (prev_F[1] + dp_T[1]) % 1000000007;

            // éèµ¤
            for (int j = 0; j < N - 1; j++) {
                dp_T
