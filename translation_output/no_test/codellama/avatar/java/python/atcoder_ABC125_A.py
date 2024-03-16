<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

import java.util.Scanner;

public class atcoder_ABC125_A {
    static long n, k, m, l, a, b, c;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        a = sc.nextInt();
        b = sc.nextInt();
        n = sc.nextInt();
        k = 0;
        for (int i = 1; i * a <= n; i++) {
            k += b;
        }
        System.out.println(k);
    }
}

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

a, b, n = map(int, sys.stdin.readline().split())
k = 0
for i in range(1, n // a + 1):
    k += b
print(k)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from a string to an integer, and the `range` function is used to iterate over the values of `i` from 1 to `n // a + 1`. The `//` operator is used for integer division, which is equivalent to the `floor` function in Java. The `print` function is used to print the final value of `k`.</s>
