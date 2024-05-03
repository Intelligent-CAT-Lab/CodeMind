Here is the Python equivalent of your Java code:

```python
import sys

cnt = int(sys.stdin.readline())
power = 1
for i in range(1, cnt+1):
    power = (power*i)%(10**9 + 7)
print(int(power))
```

This Python code does the same thing as your Java code. It reads an integer from the standard input, calculates the factorial of that integer, and then prints the result modulo 10^9 + 7. The `sys.stdin.readline()` function is used to read a line of input from the standard input, which is equivalent to `sc.nextInt()` in Java. The `range()` function is used to generate a sequence of integers from 1 to `cnt`, which is equivalent to the `for (int i = 1; i <= cnt; i++)` loop in Java. The `print()` function is used to print the result to the standard output, which is equivalent to `System.out.println()` in Java.
