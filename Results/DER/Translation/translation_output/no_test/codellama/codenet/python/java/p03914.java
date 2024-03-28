<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

mod = 1000000007
eps = 10**-9


def main():
    import sys
    input = sys.stdin.readline

    N, M = map(int, input().split())
    dp = [[0] * N for _ in range(N+1)]
    dp[1][0] = 1
    for i in range(M):
        dp_new = [[0] * N for _ in range(N+1)]
        for j in range(N+1):
            for k in range(N):
                dp_new[j][k] = (dp_new[j][k] + dp[j][k] * k)%mod
                if k+1 < N:
                    dp_new[j][k+1] = (dp_new[j][k+1] + dp[j][k] * (N - j - k))%mod
                if j+k <= N:
                    dp_new[j+k][0] = (dp_new[j+k][0] + dp[j][k] * j)%mod
        dp = dp_new
    print(dp[N][0])


if __name__ == '__main__':
    main()


Translate the above python code to java.

java code:

[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int mod = 1000000007;
        int eps = 1000000000;
        int[][] dp = new int[N + 1][N + 1];
        dp[1][0] = 1;
        for (int i = 0; i < M; i++) {
            int[][] dp_new = new int[N + 1][N + 1];
            for (int j = 0; j < N + 1; j++) {
                for (int k = 0; k < N; k++) {
                    dp_new[j][k] = (dp_new[j][k] + dp[j][k] * k) % mod;
                    if (k + 1 < N) {
                        dp_new[j][k + 1] = (dp_new[j][k + 1] + dp[j][k] * (N - j - k)) % mod;
                    }
                    if (j + k <= N) {
                        dp_new[j + k][0] = (dp_new[j + k][0] + dp[j][k] * j) % mod;
                    }
                }
            }
            dp = dp_new;
        }
        System.out.println(dp[N][0]);
    }
}
```
This is the Java code for the given Python code. The code uses the `Scanner` class to read input from the user, and the `mod` and `eps` variables are used to define the modulus and the precision of the calculations. The `dp` array is used to store the values of the recurrence relation, and the `dp_new` array is used to store the updated values of the recurrence relation. The `main` method reads the input from the user, initializes the `dp` array, and then iterates through the recurrence relation using the `for` loop. Finally, the code prints the value of `dp[N][0]` to the console.</s>
