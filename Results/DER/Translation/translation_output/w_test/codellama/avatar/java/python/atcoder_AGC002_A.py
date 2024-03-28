<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
-1000000000 -1

Expected output:
Positive


```
import java.util.*;

class atcoder_AGC002_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();

        if (a <= 0 && b >= 0 || a <= 0 && b >= 0) {
            System.out.println("Zero");
        } else if (a < 0 && b < 0) {
            System.out.println(((b - a + 1) % 2 == 0) ? "Positive" : "Negative");
        } else if (a > 0 && b > 0) {
            System.out.println("Positive");
        }
    }
}
```
[/INST]
```python
import sys

a, b = map(int, sys.stdin.readline().split())

if a <= 0 and b >= 0 or a <= 0 and b >= 0:
    print("Zero")
elif a < 0 and b < 0:
    print("Positive" if (b - a + 1) % 2 == 0 else "Negative")
elif a > 0 and b > 0:
    print("Positive")
```
This code reads two integers `a` and `b` from standard input using the `map` function and the `split` method, and then uses the `if` statement to determine the sign of the sum of the two numbers. If the sum is zero, it prints "Zero". If the sum is negative and the difference between the two numbers is odd, it prints "Negative". If the sum is negative and the difference between the two numbers is even, it prints "Positive". If the sum is positive, it prints "Positive".</s>
