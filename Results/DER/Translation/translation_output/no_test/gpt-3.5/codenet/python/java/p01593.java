```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] dp = new double[1001];
        dp[0] = 1;
        
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int j = 1;
            while (i + j <= n && j <= m) {
                dp[i + j] += dp[i] / (n - i);
                j++;
            }
        }
        
        System.out.printf("%.10f", dp[n]);
    }
}
```
