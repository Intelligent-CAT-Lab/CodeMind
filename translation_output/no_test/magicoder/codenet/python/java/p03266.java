<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
```
import sys
from fractions import gcd


def main():
    n, k = map(int, input().split())

    ans = 0

    if k % 2 == 1:
        ans = (n // k)**3
    else:
        ans = (n // k)**3 + ((n + k // 2) // k)**3
    
    print(ans)


if __name__ == '__main__':
    main()

```

@@ Response
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        long ans = 0;

        if (k % 2 == 1) {
            ans = (long) Math.pow(n / k, 3);
        } else {
            ans = (long) Math.pow(n / k, 3) + (long) Math.pow((n + k / 2) / k, 3);
        }

        System.out.println(ans);
    }
}
```

Please note that in Java, the `//` operator performs integer division, so we need to cast the operands to `long` to avoid integer overflow. Also, the `Math.pow` method in Java returns a `double`, so we need to cast the result to `long` to avoid loss of precision.<｜end▁of▁sentence｜>
