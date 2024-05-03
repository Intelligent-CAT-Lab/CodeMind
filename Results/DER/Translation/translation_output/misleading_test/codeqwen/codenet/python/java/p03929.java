Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        //11æ®µã§1å¨ããã®ã§ããã¾ã§è¨ç®ãã
        int[] r = new int[12];
        for (int i = 1; i <= 12; i++) {
            int m = 0;
            for (int j = 1; j <= 5; j++) {
                int t = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        t += 7 * (i + y) + (j + x) - 7;
                    }
                }
                if (t % 11 == k) m += 1;
            }
            r[i - 1] = m;
        }

        int a = n / 11;
        int b = n % 11;
        int ans = 0;
        ans += a * sum(r);
        if (b < 1) ans -= r[10];
        if (b < 2) ans -= r[11];
        if (b >= 3) {
            for (int i = 0; i < b - 2; i++) ans += r[i];
        }
        System.out.println(ans);
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
```

This Java code does the same thing as the Python code. It reads two integers from the user, calculates the sum of the array `r` and prints the result.
