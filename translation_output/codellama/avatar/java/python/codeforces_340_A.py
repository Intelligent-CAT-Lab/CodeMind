<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    while a % b != 0:
        a, b = b, a % b
    return b

def main():
    x, y, a, b = map(int, sys.stdin.readline().split())
    lcm = x * y // gcd(x, y)
    c = 0
    for i in range(a, b+1):
        if i % lcm == 0:
            c += 1
    print(c)

if __name__ == "__main__":
    main()
```
This is the Python code equivalent to the Java code you provided. It uses the `gcd` function to find the greatest common divisor of `x` and `y`, and then uses the `lcm` function to find the least common multiple of `x` and `y`. The `c` variable is then incremented for each number between `a` and `b` that is divisible by the `lcm`. Finally, the `c` variable is printed to the console.</s>
