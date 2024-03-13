<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
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
    x, y, a, b = map(int, sys.stdin.readline().split())
    lcm = x * y // gcd(x, y)

    i = a
    while i % lcm != 0:
        i += 1

    j = b
    while j % lcm != 0:
        j -= 1

    if j % lcm == 0 and i % lcm == 0:
        c = (j - i) // lcm + 1
    else:
        c = 0

    print(c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, calculates the least common multiple (LCM) of the first two integers, and then finds the smallest and largest integers that are multiples of the LCM and are within the range of the third and fourth integers. It then calculates the number of integers in the range that are multiples of the LCM and prints the result.<｜end▁of▁sentence｜>
