Here is the translated Python code for the given Java code:

```python
# Importing sys to read the input from the stdin
import sys

# Reading two integers from the stdin and assigning them
a, b = map(int, sys.stdin.readline().split())
kuti = 1
tap = 0

# Loop to find out the required number of taps
while kuti < b:
    kuti = kuti - 1 + a
    tap += 1

# Printing the result to stdout
print(tap)
```

Note that in Python, `sys.stdin.readline()` is used to read input from standard input similar to `Scanner sc = new Scanner(System.in);` in Java. The `map` function is used to apply the `int` function to each input received, which are the space-separated values `a` and `b`. I used `.split()` to split the input string into a list where each element is one of the inputs (`a` or `b`).
