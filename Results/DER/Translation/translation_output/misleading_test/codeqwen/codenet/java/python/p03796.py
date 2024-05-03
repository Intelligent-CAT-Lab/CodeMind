Here is the Python equivalent of the Java code:

```python
import sys

cnt = int(sys.stdin.readline())
power = 1
for i in range(1, cnt+1):
    power = (power*i)%(10**9 + 7)
print(power)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, calculates the power of the integer from 1 to the input number, and then prints the result. The `sys.stdin.readline()` function is used to read a line of text from the standard input, and `int()` is used to convert the text to an integer. The `range()` function is used to generate a sequence of numbers from 1 to the input number, and the `for` loop is used to calculate the power of the integer. The `%` operator is used to calculate the remainder of the division of the power by 10^9 + 7, which is used to prevent integer overflow. The `print()` function is used to print the result.
