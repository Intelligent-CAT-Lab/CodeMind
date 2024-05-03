Here is the Python equivalent of the Java code:

```python
import sys

cnt = int(sys.stdin.readline())
power = 1
for i in range(1, cnt+1):
    power = (power*i)%(10**9 + 7)
print(power)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the factorial of that integer, and then prints the result modulo 10^9 + 7. The `sys.stdin.readline()` function reads a line of input from the standard input, and the `int()` function converts that line into an integer. The `range()` function generates a sequence of integers from 1 to `cnt`, and the `for` loop calculates the factorial of `cnt` by multiplying all the integers in that sequence together. The `%` operator calculates the remainder of the division of `power` by 10^9 + 7, which is used to keep the result within a manageable range. Finally, the `print()` function prints the result to the standard output.
