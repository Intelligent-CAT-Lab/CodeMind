<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

a, b = map(int, sys.stdin.readline().split())

if a <= 0 and b >= 0 or a <= 0 and b >= 0:
    print("Zero")
elif a < 0 and b < 0:
    print("Negative" if (b - a + 1) % 2 == 0 else "Positive")
elif a > 0 and b > 0:
    print("Positive")
```
Note: The `map` function is used to convert the input from a string to an integer. The `sys.stdin.readline()` function is used to read a line of input from the standard input stream. The `split()` function is used to split the input into two integers.</s>
