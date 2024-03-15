Here is the translated code from Java to Python:

```python
# No need to import anything for basic input/output

def main():
    x1 = int(input())
    y1 = int(input())
    x2 = int(input())
    y2 = int(input())

    a = x2 - x1
    b = y2 - y1
    x3 = x2 - b
    y3 = y2 + a
    x4 = x3 - a
    y4 = y3 - b

    print(f"{x3} {y3} {x4} {y4}")

if __name__ == "__main__":
    main()
```

Python provides built-in functionality for input/output, so we don't import a Scanner like in Java. Instead, we use `input()` for reading from stdin. The print statement in Python is also simpler, allowing for inline variable formatting with f-strings. The equivalent Python code is wrapped inside a `main` function to follow a similar structural pattern to the Java code.
