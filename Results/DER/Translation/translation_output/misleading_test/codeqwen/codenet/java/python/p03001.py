Here is the Python equivalent of the Java code:

```python
import sys

def main():
    w, h, x, y = map(int, sys.stdin.readline().split())
    ans = (w * h) / 2
    a = 1 if x + x == w and y + y == h else 0
    print(ans, a)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads four integers from the standard input, calculates the area of the rectangle, and then checks if the rectangle is a square. If it is, it sets the variable `a` to 1; otherwise, it sets `a` to 0. Finally, it prints the area and the value of `a`.
