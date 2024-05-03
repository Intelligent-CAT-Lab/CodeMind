Here is the Python version of the Java code:

```python
import sys

def solve():
    x, y = map(int, sys.stdin.readline().split())

    if x >= 0:
        if y >= 0:
            if x > y:
                if y == 0:
                    print(x - y + 1)
                else:
                    print(x - y + 2)
            else:
                print(y - x)
        else:
            print(abs(abs(y) - x) + 1)
    else:
        if y >= 0:
            if y == 0:
                print(abs(abs(x) - y))
            else:
                print(abs(abs(x) - y) + 1)
        else:
            if x > y:
                print(x - y + 2)
            else:
                print(y - x)

if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, performs the same calculations as the Java code, and prints the result. The `map` function is used to convert the input strings to integers. The `sys.stdin.readline()` function is used to read a line of input from the standard input. The `split()` function is used to split the input line into two integers. The `print` function is used to print the result.
