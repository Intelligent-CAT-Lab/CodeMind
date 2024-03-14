<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
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
```

### Response:
```python
import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    n = int(sys.stdin.readline())
    k = 0
    for i in range(1, n // a + 1):
        k += b
    print(k)

if __name__ == "__main__":
    main()
```
This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the sum of `b` for each `i` from 1 to `n // a + 1`, and then prints the result.
<|EOT|>
