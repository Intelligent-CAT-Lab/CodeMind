```java
import java.util.*;

public class Main {
    static long[][] star = new long[1001][1001];
    static final long mod = 1000000007;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        populateStarArray();

        long ans = 0;
        for (int i = 0; i <= k; i++) {
            ans += search(n, i);
            ans %= mod;
        }

        System.out.println(ans);
    }

    public static void populateStarArray() {
        for (int i = 0; i < 1001; i++) {
            star[i][1] = 1;
            star[i][i] = 1;
            star[i][0] = 0;
        }
    }

    public static long search(int n, int k) {
        if (n < k) {
            return 0;
        } else if (star[n][k] != 0) {
            return star[n][k] % mod;
        } else {
            star[n][k] = (search(n - 1, k - 1) + k * search(n - 1, k)) % mod;
            return star[n][k];
        }
    }
}
```
