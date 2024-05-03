Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int P = (int) Math.pow(10, 9) + 7;
        int[] X = new int[K + 1];
        long ans = 0;
        for (int i = 1; i <= K; i++) {
            X[i] += i;
            for (int j = i * 2; j <= K; j += i) {
                X[j] -= X[i];
            }
            ans += (long) X[i] * Math.pow(K / (double) i, N, P);
        }
        System.out.println(ans % P);
    }
}
```

Please note that in Java, we use `Math.pow` for floating point numbers, and for integer division, we use `/` instead of `//`. Also, Java does not support `pow` function for integer numbers, so we need to cast it to `double` before using `Math.pow`.
