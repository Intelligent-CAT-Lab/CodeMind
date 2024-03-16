<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java Code:

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

Translate the above java code to python.

python Code:

[/INST]
```python
import sys

o, n, g = map(int, sys.stdin.readline().split())
x = 0

for i in range(1, g+1):
    x += i * o

borrow = x - n

if borrow <= 0:
    print(0)
else:
    print(borrow)
```
This is the equivalent Python code for the given Java code. The `map` function is used to convert the input from the standard input stream into integers, and the `range` function is used to iterate over the values of `i` from 1 to `g`. The rest of the code is similar to the Java code, with the exception of the `print` function, which is used to print the output in Python.</s>
