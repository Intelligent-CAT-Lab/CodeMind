<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 1

Expected output:
7


```
from math import ceil, floor, log2
import sys

n, a = map(int, next(sys.stdin).strip().split())

t = n
for k in range(1, ceil(log2(n))):
    d = ceil(n ** (1 / k))
    l = 0
    r = k
    while l + 1 < r:
        c = (l + r) // 2
        if n <= (d - 1) ** (k - c) * d ** c:
            r = c
        else:
            l = c
    t = min(t, (d - 1) * (k - r) + d * r + (k - 1) * a)
print(t)

```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a;
        n = scanner.nextInt();
        a = scanner.nextInt();
        int t = n;
        for (int k = 1; k < (int) Math.ceil(Math.log(n) / Math.log(2)); k++) {
            int d = (int) Math.ceil(Math.pow(n, 1.0 / k));
            int l = 0;
            int r = k;
            while (l + 1 < r) {
                int c = (l + r) / 2;
                if (n <= (d - 1) * Math.pow(2, k - c) * Math.pow(2, c) + (k - 1) * a) {
                    r = c;
                } else {
                    l = c;
                }
            }
            t = Math.min(t, (d - 1) * (k - r) + d * r + (k - 1) * a);
        }
        System.out.println(t);
    }
}
```</s>
