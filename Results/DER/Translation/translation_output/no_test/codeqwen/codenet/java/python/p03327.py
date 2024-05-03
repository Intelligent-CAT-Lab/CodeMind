Here is the Python equivalent of the Java code you provided:

```python
import sys

MOD = 10**9 + 7  # 10^9+7
MAX = 2**31 - 1  # intMax
INF = 10**9  # 10^9

def main():
    saori = sys.stdin.readline().strip()
    n = int(saori)
    if n < 1000:
        print("ABC")
    else:
        print("ABD")

if __name__ == "__main__":
    main()
```

In this Python code, we're using the `sys.stdin.readline().strip()` function to read the input from the standard input (stdin), which is equivalent to `saori.nextHayami()` in the Java code. We then convert the input to an integer using the `int()` function, which is equivalent to `saori.saori_hayami()` in the Java code. Finally, we use an `if` statement to check if the input is less than 1000 and print "ABC" or "ABD" accordingly.
