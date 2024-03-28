<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

import java.util.*;

public class p02206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();
        long left = 1;
        long right = k + 1;
        while (right - left > 1) {
            long m = (left + right) / 2;
            long x = m;
            long total = 0;
            for (int i = 0; i < n && x > 0 && total <= k; i++) {
                total += x;
                x /= 2;
            }
            if (total <= k) {
                left = m;
            } else {
                right = m;
            }
        }
        System.out.println(left);
    }
}



Translate the above java code to python.

python code:

[/INST]
```python
import sys

n, k = map(int, sys.stdin.readline().split())
left = 1
right = k + 1
while right - left > 1:
    m = (left + right) // 2
    x = m
    total = 0
    for i in range(n):
        total += x
        x //= 2
        if total > k:
            break
    if total <= k:
        left = m
    else:
        right = m
print(left)
```
This is the Python code equivalent to the Java code you provided. It uses the `sys` module to read input from stdin and the `map` function to convert the input strings to integers. The rest of the code is similar to the Java code, with a few minor changes to account for the differences in syntax between Python and Java.</s>
