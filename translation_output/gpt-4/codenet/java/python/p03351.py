Here's the equivalent Python code for the provided Java snippet:

```python
# No need to import a scanner, as Python has built-in functions for input

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    d = int(input())
    ab = abs(a - b)
    ac = abs(a - c)
    bc = abs(b - c)
    if ac <= d or (ab <= d and bc <= d):
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code captures input from the user similar to how the `Scanner` class does in Java, and then performs the same calculations and conditional checks. In Python, `abs()` is a built-in function that returns the absolute value, just like `Math.abs()` does in Java. The `print()` function is used to output text to the console in Python.
