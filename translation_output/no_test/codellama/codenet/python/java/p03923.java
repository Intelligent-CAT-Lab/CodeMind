<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]
```
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
This is the Java code for the given Python code. It uses the `Scanner` class to read input from the user, and the `Math` class to perform mathematical operations. The code is similar to the Python code, with some minor differences in syntax and naming conventions.</s>
