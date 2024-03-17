<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
54 20

Expected output:
2


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
```
import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    while a % b != 0:
        a, b = b, a % b
    return b

if __name__ == '__main__':
    a, b = map(int, sys.stdin.readline().split())
    print(gcd(a, b))
```
This code uses the same algorithm as the Java code, but it is written in Python. It defines a function `gcd` that takes two integers `a` and `b` as input and returns their greatest common divisor. The function uses a while loop to repeatedly divide `a` by `b` until the remainder is 0, and then returns `b`.

The main part of the code reads the input from the standard input using `sys.stdin.readline()`, splits the input into two integers using `split()`, and then calls the `gcd` function with the two integers as input. The result of the `gcd` function is then printed to the standard output using `print()`.</s>
