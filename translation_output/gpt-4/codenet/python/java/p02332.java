Here's the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class CombinationModulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        long MOD = (long)1e9 + 7;

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

Note that in Java, we must explicitly declare the variables' types. Additionally, variables must be declared and initialized before use, unlike Python where we can use tuple unpacking to declare and initialize multiple variables at once. Also, Java uses a `Scanner` object for taking input.

