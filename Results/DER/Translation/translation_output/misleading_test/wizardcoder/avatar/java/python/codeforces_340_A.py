Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 1 1 1000000000

Expected output:
1000000044

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
import math

def gcd(a, b):
    if b == 0:
        return a
    else:
        return gcd(b, a % b)

def lcm(a, b):
    return (a * b) // gcd(a, b)

def count_divisors(n):
    count = 0
    for i in range(1, int(math.sqrt(n)) + 1):
        if n % i == 0:
            count += 2
    if int(math.sqrt(n))**2 == n:
        count -= 1
    return count

def main():
    x, y, a, b = map(int, input().split())
    lcm_xy = lcm(x, y)
    count = 0
    for i in range(a, b+1):
        if i % lcm_xy == 0:
            count += 1
    print(count)

if __name__ == '__main__':
    main()
```

Explanation:

- The `gcd` function is used to find the greatest common divisor of two numbers.
- The `lcm` function is used to find the least common multiple of two numbers.
- The `count_divisors` function is used to count the number of divisors of a number.
- The `main` function reads the input, finds the least common multiple of `x` and `y`, and counts the number of integers between `a` and `b` that are divisible by `lcm_xy`.
- The output is printed.<|endoftext|>
