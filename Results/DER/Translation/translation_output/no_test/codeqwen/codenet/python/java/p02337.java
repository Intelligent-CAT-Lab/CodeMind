Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    static final int MOD = 1000000007;
    static final int MAX = 1001;
    static int[][] star = new int[MAX][MAX];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < MAX; i++) {
            star[i][1] = 1;
            star[i][i] = 1;
            star[i][0] = 0;
        }

        int ans = 0;
        for (int i = 0; i <= k; i++) {
            ans += search(n, i);
            ans %= MOD;
        }

        System.out.println(ans);
    }

    static int search(int n, int k) {
        if (n < k) {
            return 0;
        } else if (star[n][k] != 0) {
            return star[n][k] % MOD;
        } else {
            star[n][k] = (search(n - 1, k - 1) + k * search(n - 1, k)) % MOD;
            return star[n][k];
        }
    }
}
```

Please note that Java does not have a built-in way to set the recursion limit like Python does. If you need to increase the recursion limit, you can use the `java.lang.reflect.ReflectPermission` class, but this is generally not recommended as it can lead to stack overflow errors.
