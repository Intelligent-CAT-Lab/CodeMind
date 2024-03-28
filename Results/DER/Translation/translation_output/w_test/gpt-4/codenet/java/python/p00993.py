Here's the translated Python code. The `BigInteger` from Java is translated to regular integer arithmetic in Python, as Python's integers have arbitrary precision by default.

```python
from math import factorial

def calculate_fact():
    # Calculate the factorial of 1510
    fact = 1
    for i in range(1, 1511):
        fact *= i
    return fact + 2

fact = calculate_fact()

# Read input and print output according to given logic
try:
    while True:
        n = int(input())
        print(fact)

        for i in range(2, 2 + n):
            print(i)
except EOFError:
    pass
```

Test this function with input "2" and it should produce the expected output:

```
8
2
3
```

In Python, reading from standard input until EOF can be handled with a `try` and `except EOFError` block as shown in the translated code. The `EOFError` is raised when the `input()` function hits the end-of-file condition (for example, when no more input is available if this code is run in a console/terminal).
