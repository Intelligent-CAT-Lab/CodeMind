```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int MOD = 1000000007;

        if (K < N) {
            System.out.println(0);
        } else {
            long ans = 1;
            for (int v = K; v > K-N; v--) {
                ans = ans * v % MOD;
            }
            System.out.println(ans);
        }
    }
}
```
