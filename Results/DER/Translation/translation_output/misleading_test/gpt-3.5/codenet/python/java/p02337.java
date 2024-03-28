```java
import java.util.*;

public class StarPattern {

    private static final int mod = 1000000007;
    private static Long[][] star = new Long[1001][1001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < 1001; i++) {
            star[i][1] = 1L;
            star[i][i] = 1L;
            star[i][0] = 0L;
        }

        System.out.println(calculateStar(n, k));
    }

    private static long calculateStar(int n, int k) {
        return calculateStarHelper(n, k) % mod;
    }

    private static long calculateStarHelper(int n, int k) {
        if (n < k) {
            return 0;
        } else if (star[n][k] != null) {
            return star[n][k] % mod;
        } else {
            star[n][k] = (calculateStarHelper(n - 1, k - 1) + k * calculateStarHelper(n - 1, k)) % mod;
            return star[n][k];
        }
    }
}
```  
