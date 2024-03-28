Here is the translated code from Java to Python:
```python
import sys

def main():
    a, b = map(float, input().split())
    bb = int(b * 100 + 0.1)
    ans = (a * bb) // 100
    print(ans)

if __name__ == "__main__":
    main()
```

This code takes two space-separated inputs (integer "a" and floating-point "b"), performs a calculation, and outputs an integer result. It uses Python's built-in `int` function to emulate Java's type casting operations and floor division (`//`) to get an integer result from the division.
