Here is the translated Python code from the provided Java code. The Python code performs the same operations as the Java code:

```python
import sys
from math import gcd

def lcm(a, b):
    return a * b // gcd(a, b)

def find_multiples(a, b, lcm):
    for i in range(a, b+1):
        if i % lcm == 0:
            return i
    return None

def main():
    # Reading input from stdin and splitting into variables
    x, y, a, b = map(int, input().split())

    c = 0
    lcm_xy = lcm(x, y)

    # Finding the first multiple of lcm_xy that is >= a
    first = find_multiples(a, b, lcm_xy)
    # Finding the last multiple of lcm_xy that is <= b
    last = find_multiples(b, a, lcm_xy)

    # Check if found multiples in the range [a, b]
    if first is not None and last is not None:
        c = (last - first) // lcm_xy + 1

    # Printing result to stdout
    print(c)

if __name__ == '__main__':
    main()
```

In Python, we do not have to declare types for variables, and we can use the `gcd` function from the `math` module (Python 3.5+).

Also, the standard output in Python (`print` function) does not need to be flushed manually in most cases, as it typically will flush when a newline character is written or when the buffer is full. However, for competitive programming it might be necessary to use `sys.stdout.flush()` after `print` or to set up a manual flush with `print(c, flush=True)`.

Another point to consider is that, unlike Java, Python does not require the definition of `gcd` if using the math module since it is already available.

Note that the code is written under the assumption that the input will be provided in the same format as expected by the Java program.
