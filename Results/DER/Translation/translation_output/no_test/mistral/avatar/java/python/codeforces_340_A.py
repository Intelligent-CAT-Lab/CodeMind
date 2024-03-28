<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def main():
    sys.stdin = sys.stdin.buffer
    sys.stdout = sys.stdout.buffer

    z = input().split()
    x = int(z[0])
    y = int(z[1])
    a = int(z[2])
    b = int(z[3])

    lcm = x * y // gcd(x, y)

    for i in range(a, b+1):
        if i % lcm == 0:
            break

    for j in range(b, a-1, -1):
        if j % lcm == 0:
            break

    if j % lcm == 0 and i % lcm == 0:
        c = (j - i) // lcm + 1
        print(c)

if __name__ == '__main__':
    main()
```</s>
