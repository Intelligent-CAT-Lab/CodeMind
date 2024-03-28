<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
54 20

Expected output:
27

```
import java.io.*;

class p02256 {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);

        System.out.println(GCD(a, b));
    }

    public static int GCD (int a, int b) {
        if (a < b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a % b == 0) return b;
        else return GCD (b, a%b);
    }
}
```
[/INST]
```python
import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)

a, b = map(int, sys.stdin.readline().split())
print(gcd(a, b))
```
This code reads two integers from standard input using the `sys.stdin.readline()` method, splits them into two integers using the `split()` method, and then calls the `gcd()` function to calculate the greatest common divisor of the two integers. The `gcd()` function is defined using recursion, and it uses the Euclidean algorithm to find the greatest common divisor of two integers. The `gcd()` function returns the result of the calculation, which is then printed to standard output using the `print()` function.</s>
