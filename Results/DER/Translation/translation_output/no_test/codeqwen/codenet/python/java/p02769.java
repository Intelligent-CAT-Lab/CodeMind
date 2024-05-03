Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int mod = (int) Math.pow(10, 9) + 7;

        if (n <= k) {
            int x = 1;
            for (int i = 0; i < n - 1; i++) {
                x = (x * 2 * n - 1 - i) % mod;
            }
            int y = 1;
            for (int i = 0; i < n - 1; i++) {
                y = (y * (i + 1)) % mod;
            }
            System.out.println((x * bp(y, mod)) % mod);
        } else {
            int x = 1;
            int y = 1;
            int t = 1;
            for (int i = 0; i < k; i++) {
                t = (t * (i + 1)) % mod;
                y = (y * (n - 1 - i)) % mod;
                y = (y * (n - i)) % mod;
                int c = bp(t, mod);
                x = (x + y * c * c) % mod;
            }
            System.out.println(x);
        }
    }

    public static int bp(int a, int n) {
        int r = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                r = (r * a) % mod;
            }
            a = (a * a) % mod;
            n >>= 1;
        }
        return r;
    }
}
```

Please note that Java does not have a built-in function to split a string into an array of integers, so I used a Scanner object to read the input. Also, Java does not
