Here is the Python equivalent of the Java code you provided:

```python
import sys

MOD = 10**9 + 7  # 10^9+7
MAX = 2**31 - 1  # intMax
INF = 10**9  # 10^9

def main():
    saori = sys.stdin.readline().strip()
    n = int(saori)
    i = 1
    while True:
        if i * n % 360 == 0:
            print(i)
            return
        i += 1

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code you provided. It reads an integer from the standard input, multiplies it by an integer `i` and checks if the result is divisible by 360. If it is, it prints `i` and returns. If it isn't, it increments `i` and repeats the process.
