<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class codeforces_546_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int o, g, x = 0;
        long n, borrow = 0;

        o = sc.nextInt();
        n = sc.nextLong();
        g = sc.nextInt();

        for (int i = 1; i <= g; i++) {
            x = x + i * o;
        }

        borrow = x - n;

        if (borrow <= 0)
            System.out.println(0);
        else
            System.out.println(borrow);
    }
}
```

### Response:
```python
import sys

def main():
    o, n, g = map(int, sys.stdin.readline().split())
    x = 0
    borrow = 0

    for i in range(1, g + 1):
        x += i * o

    borrow = x - n

    if borrow <= 0:
        print(0)
    else:
        print(borrow)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, calculates the total cost of the candies, and then prints the difference between this total and the amount of money given. If the amount given is greater than or equal to the total cost, it prints 0. Otherwise, it prints the difference.
<|EOT|>
