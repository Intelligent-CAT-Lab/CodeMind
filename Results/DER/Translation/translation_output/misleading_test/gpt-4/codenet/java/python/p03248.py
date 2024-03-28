Below is the converted Python code. Note that in the original Java code, the program logic heavily depends on the `Reader` and `PrintWriter` classes to handle input and output. In Python, we make use of built-in functions such as `input()` and `print()` for handling input and output. Python also does not use semicolons to terminate statements, and blocks are defined by indentation rather than braces.

```python
import sys
from math import gcd

def main():
    # Read input as a string
    c = input().strip()
    l = len(c)

    if c[0] == '0' or c[l - 1] == '1':
        print(-1)
        return
    else:
        for i in range(l // 2):
            if c[i] != c[l - i - 2]:
                print(-1)
                return

    print(1, 2)

    s = 2
    for i in range(3, l + 1):
        print(s, i)
        if c[i - 2] == '1':
            s = i

if __name__ == '__main__':
    main()
```

For the test case with input `1111`, you can run the Python code and expect the output `-71`, based on the logic in the input code.
