Below is the translated Python code to Java:

```java
import java.util.Scanner;

public class Coins {
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

To run this Java program, you would input `100` and expect the output `4` as per your test case.
