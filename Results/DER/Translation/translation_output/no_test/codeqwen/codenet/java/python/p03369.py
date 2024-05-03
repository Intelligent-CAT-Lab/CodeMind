Here is the Python equivalent of the Java code you provided:

```python
import sys

def gs():
    return sys.stdin.readline().strip()

def gi():
    return int(sys.stdin.readline())

def gl():
    return float(sys.stdin.readline())

def gd():
    return float(sys.stdin.readline())

if __name__ == "__main__":
    s = gs()
    print((len(s) - s.count('o')) * 100 + 700)
```

In this Python code, we use `sys.stdin.readline()` to read a line of input from the standard input (usually the keyboard). The `strip()` method is used to remove any leading or trailing whitespace from the input.

The `gi()`, `gl()`, and `gd()` functions are similar to their Java counterparts, but they use the `int()`, `float()`, and `float()` functions to convert the input to an integer, float, or double, respectively.

In the main part of the program, we read a string `s` using `gs()`, and then calculate the result using the same formula as in the Java code. The `count()` method is used to count the number of occurrences of the character 'o' in the string `s`.
