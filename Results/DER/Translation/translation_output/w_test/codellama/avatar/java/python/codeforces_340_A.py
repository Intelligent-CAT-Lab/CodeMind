<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 1 1000000000

Expected output:
1000000000


```
import java.util.*;
import java.io.*;

public class codeforces_340_A {
    public static void main(String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new BufferedOutputStream(System.out));

        String[] z = br.readLine().split(" ");
        int x = Integer.parseInt(z[0]);
        int y = Integer.parseInt(z[1]);
        int a = Integer.parseInt(z[2]);
        int b = Integer.parseInt(z[3]);

        int c = 0, i, j;
        int lcm = x * y / gcd(x, y);

        for (i = a; i <= b; i++) {
            if (i % lcm == 0) {
                break;
            }
        }

        for (j = b; j >= a; j--) {
            if (j % lcm == 0) {
                break;
            }
        }

        if (j % lcm == 0 && i % lcm == 0) {
            c = (j - i) / lcm + 1;
        }

        pw.println(c);
        pw.close();
    }

    public static int gcd(int a, int b) {
        int temp = a;
        if (a < b) {
            a = b;
            b = temp;
        }

        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}
```
[/INST]

Here is the Python code that solves the problem:
```python
import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    while a % b != 0:
        a, b = b, a % b
    return b

def solve(x, y, a, b):
    lcm = x * y // gcd(x, y)
    c = 0
    for i in range(a, b+1):
        if i % lcm == 0:
            c += 1
    return c

x, y, a, b = map(int, sys.stdin.readline().split())
print(solve(x, y, a, b))
```
This code first defines a function `gcd` that calculates the greatest common divisor of two numbers using the Euclidean algorithm. It then defines a function `solve` that takes the input `x`, `y`, `a`, and `b` and calculates the number of integers between `a` and `b` that are divisible by the least common multiple of `x` and `y`. The `solve` function uses the `gcd` function to calculate the least common multiple, and then iterates over the range of integers between `a` and `b` to count the number of integers that are divisible by the least common multiple. Finally, the `solve` function returns the result.

The code then reads the input from standard input using `sys.stdin.readline()`, splits the input into four integers using `split()`, and passes them to the `solve` function. The result is then printed to standard output using `print()`.</s>
