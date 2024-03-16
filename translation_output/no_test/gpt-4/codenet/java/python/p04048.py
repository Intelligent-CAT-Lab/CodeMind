Below is the translated Java code to Python. This translation omits unnecessary Java-specific I/O handling and simplifies the logic according to Python's standard input and output functions:

```python
import sys

def solver():
    n = int(input())
    x = int(input())
    sum = 0
    if x == n - x:
        sum = 3 * x
        print(sum)
        return
    else:
        sum += x + n - x
        sum += calc(x, n - x, False)
        print(sum)
        return

def calc(x, y, first):
    sum = 0
    if x % y == 0:
        if first:
            sum += y
        sum += (x // y * 2 - 1) * y
        return sum
    else:
        if first:
            sum += y
        sum += (x // y * 2) * y
        sum += calc(y, x % y, False)
        return sum

if __name__ == "__main__":
    solver()
```

Note:

1. We used `input()` for reading input as the original Java code was reading from `System.in`.
2. Since Python 3 prints to standard output, we used `print()` function.
3. Python function `int()` is used to convert string to integer.
4. As there is no need for manual buffering and parsing given that `input()` in Python does it, the methods `nl()`, `nc()`, `nd()`, `ns()`, `ns(int n)`, `nse(int n)`, `skip()`, `eof()`, and `ni()` were not translated to Python. Python's standard input functions handle these cases much more concisely.
5. The Python code uses direct integer input as opposed to byte parsing used in the Java version, which simplifies the reading of variables `n` and `x`. 

Please note that this translation assumes that the input values will be given in a way that the `input()` function in Python can correctly read them, meaning one value per line or space-separated on the same line.
