Here is the Python version of your Java code:

```python
import sys

def main():
    d, t, s = map(int, sys.stdin.readline().split())
    ans = d / s
    if ans <= t:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as your Java code. It reads in three integers from the standard input, calculates the result of dividing the first integer by the third, and then prints out "Yes" if the result is less than or equal to the second integer, or "No" otherwise.
