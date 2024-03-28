<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def gcd(a, b):
    if a < b:
        a, b = b, a
    if a % b == 0:
        return b
    else:
        return gcd(b, a % b)

def main():
    z = sys.stdin.readline().split()
    x, y, a, b = map(int, z)
    lcm = x * y // gcd(x, y)

    i = next(i for i in range(a, b+1) if i % lcm == 0)
    j = next(j for j in range(b, a-1, -1) if j % lcm == 0)

    if i % lcm == 0 and j % lcm == 0:
        c = (j - i) // lcm + 1
    else:
        c = 0

    print(c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, calculates the least common multiple (LCM) of the first two integers, and then finds the first and last numbers in the range from `a` to `b` that are multiples of the LCM. The difference between these two numbers is divided by the LCM and incremented by 1 to give the count `c`. If no such numbers exist, `c` is set to 0. The count `c` is then printed to the standard output.
<|EOT|>
