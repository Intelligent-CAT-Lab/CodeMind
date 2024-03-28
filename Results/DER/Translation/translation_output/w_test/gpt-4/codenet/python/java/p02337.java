Here's the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class Main {
    private static final int MOD = (int)1e9 + 7;
    private static final int MAX = 1001;
    private static Integer[][] star = new Integer[MAX][MAX];
    
    static {
        for (int i = 0; i < MAX; i++) {
            star[i][1] = 1;
            star[i][i] = 1;
            star[i][0] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long ans = 0;
        
        for (int i = 0; i <= k; i++) {
            ans += search(n, i);
            ans %= MOD;
        }

        System.out.println(ans);
        scanner.close();
    }

    public static int search(int n, int k) {
        if (n < k) {
            return 0;
        } else if (star[n][k] != null) {
            return star[n][k] % MOD;
        } else {
            star[n][k] = (int)(((long)search(n - 1, k - 1) + (long)k * search(n - 1, k)) % MOD);
            return star[n][k];
        }
    }
}
```

Make sure to run this with a suitable stack size if you're going to test with large inputs because Java has a smaller default stack size compared to Python. This could be done by using the `-Xss` option when running the Java Virtual Machine, like `java -Xss100m Main`.
