Below is the equivalent Python code for the provided Java Code:

```python
import math
import sys

def main():
    # Assuming input is provided in the same way as the example
    # and using sys.stdin.readline to mimic FastReader
    n, m = map(float, input().split())
    for i in range(int(m - (n % m))):
        print(int(n // m), end=" ")
    for i in range(int(m - (n % m)), int(m)):
        print(int(math.ceil(n / m)), end=" ")
    print()

if __name__ == "__main__":
    main()
```

Here's how the code works:
- Instead of using a custom class `FastReader`, the code reads from standard input (`stdin`) with `input()`, which is Python’s equivalent to Java’s `Scanner`.
- The `math` module in Python provides the `math.ceil` function which is used just as `Math.ceil` in Java.
- Python uses `//` for integer division and `/` for float division, thus replacing the need for explicit type casting as done in Java.
- I have replaced the `printWriter` Java class with Python's built-in `print` function which can print to the standard output. The `end=" "` parameter is added to avoid the new line that `print` adds by default.
- Python does not require an explicit call to `close()` for the standard output.

For the test input "87 34" provided as a string, just as if it was passed through standard input, the expected output will be generated correctly with the above Python code when executed.
