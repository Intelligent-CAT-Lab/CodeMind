Here's the translated code in Java:

```java
import java.util.Scanner;

public class CoinCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        int[] coins = {25, 10, 5, 1};

        for (int x : coins) {
            ans += n / x;
            n %= x;
        }

        System.out.println(ans);
    }
}
```

To run this Java code with the test input `100`, you would run the program and input `100` when prompted. The expected output would be `25`.

It's worth noting that scanner.nextInt() will throw an `InputMismatchException` if the input is not an `int`. Therefore, proper error handling is recommended for production-quality code.
