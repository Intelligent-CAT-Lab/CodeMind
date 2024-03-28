Here is the equivalent Java code for the given Python script:

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        if (n == 1) {
            System.out.println(p);
        } else if (p == 1) {
            System.out.println(1);
        } else if (n >= 40) {
            System.out.println(1);
        } else {
            long ans = 1;
            int count = 2;
            long tmp = (long) Math.pow(count, n);
            while (tmp <= p) {
                if (p % tmp == 0) {
                    ans *= count;
                    p /= tmp;
                    count -= 1;
                }
                count += 1;
                tmp = (long) Math.pow(count, n);
            }
            System.out.println(ans);
        }

        scanner.close();
    }
}
```

A few notes about the Java version:
- We use `Scanner` for input.
- In the while loop, we use `long` for `tmp` and `ans` since the number might get very large when raising to the `n`th power.
- We include `Math.pow()` to calculate the power.
- No need to convert `p` explicitly to an integer after division because Java automatically truncates the decimal part when dividing integers.
- We print the result to the standard output using `System.out.println()`.
