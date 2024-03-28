Below is the translated Python code based on the provided Java code:

```python
import sys

def read_ints():
    return map(int, input().split())

def solve(x, y):
    ans = 0
    while x <= y:
        ans += 1
        x *= 2
    return ans

def main():
    x, y = read_ints()
    print(solve(x, y))

if __name__ == "__main__":
    main()
```

To use this Python script, you would run it and then input the test values (`3 20`) from standard input (e.g., through the command line). Then it should output the expected result (`70`). 

The original Java code contains a lot more than needed for running the core functionality, like all the methods for reading input from an `InputStream` and handling different types of input. In Python, this is generally much simpler due to its built-in functions and dynamic typing. For example, the `input()` function in Python does the job of reading from standard input, and `map()` along with `split()` is used for reading multiple integers from a single line. The Python code assumes input will be given in the correct format, as error handling around the input is not provided similarly to the Java version.
