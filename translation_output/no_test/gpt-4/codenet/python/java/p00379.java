Here's the translated code in Java:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int ans = 0;

        for (int y = 1; y < 50; y++) {
            long x = (long) Math.pow(y + a, n);
            if (1 <= x && x <= m && y == sumOfDigits(x)) {
                ans++;
            }
        }
        System.out.println(ans);

        scanner.close();
    }

    private static int sumOfDigits(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
```

Here are the key points about the translation:

1. Java requires explicit type declarations, so `int` is used for integer declarations.
2. Input is handled using a `Scanner` object.
3. Separate function `sumOfDigits(long number)` is created to calculate the sum of digits of a number since Java does not have a built-in function equivalent to Python's `sum(map(int, str(x)))`.
4. The power calculation is done using `Math.pow`, but the result is cast to `long` to handle bigger numbers.
