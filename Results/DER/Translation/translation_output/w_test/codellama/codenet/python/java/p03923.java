<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
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

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int t = n;
        for (int k = 1; k <= Math.ceil(Math.log2(n)); k++) {
            int d = (int) Math.ceil(Math.pow(n, 1.0 / k));
            int l = 0;
            int r = k;
            while (l + 1 < r) {
                int c = (l + r) / 2;
                if (n <= (d - 1) * Math.pow(k - c, d * c) * d * c) {
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
```
This is a Java implementation of the Python code provided. The `Scanner` class is used to read input from the user, and the `Math` class is used for mathematical operations such as `ceil`, `log2`, and `pow`. The `min` method is used to find the minimum of two values. The `println` method is used to print the result to the console.</s>
