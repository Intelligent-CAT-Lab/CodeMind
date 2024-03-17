<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
999999999 999999999

Expected output:
0


```
import java.util.Scanner;
import java.util.codeforces_86_Arrays;

public class codeforces_86_A {
    public static int power(Long a) {
        int res = 0;
        while (a > 0) {
            res++;
            a = a / 10;
        }
        return res;
    }

    public static long mult(Long a) {
        int pow = power(a);
        long max = 0;
        for (int j = 0; j < pow; ++j) {
            max = max * 10 + 9;
        }
        return a * (max - a);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long l = in.nextLong();
        long r = in.nextLong();
        long res = 0;
        long[] maxxes = new long[10];
        long temp = 0;
        for (int i = 0; i < 10; ++i) {
            temp = temp * 10 + 9;
            maxxes[i] = temp / 2 * (temp - temp / 2);
        }
        res = Math.max(mult(l), res);
        res = Math.max(mult(r), res);
        temp = 0;
        for (int i = 0; i < 10; ++i) {
            temp = temp * 10 + 9;
            if (l <= temp / 2 && temp / 2 <= r)
                res = Math.max(maxxes[i], res);
        }
        System.out.println(res);
    }
}
```

@@ Response
```python
def power(a):
    res = 0
    while a > 0:
        res += 1
        a = a // 10
    return res

def mult(a):
    pow = power(a)
    max = 0
    for j in range(pow):
        max = max * 10 + 9
    return a * (max - a)

def main():
    l, r = map(int, input().split())
    res = 0
    maxxes = [0] * 10
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        maxxes[i] = temp // 2 * (temp - temp // 2)
    res = max(mult(l), res)
    res = max(mult(r), res)
    temp = 0
    for i in range(10):
        temp = temp * 10 + 9
        if l <= temp // 2 and temp // 2 <= r:
            res = max(maxxes[i], res)
    print(res)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the input, calculates the maximum value of the product of two numbers, and prints the result.<｜end▁of▁sentence｜>
