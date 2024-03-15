Certainly! Here is the translated Python code:

```python
def main():
    n = int(input())
    a = int(input())
    b = int(input())

    if a > b or (n == 1 and a != b):
        print(0)
        return
    if a == b:
        print(1)
        return

    print((n - 2) * (b - a) + 1)

if __name__ == "__main__":
    main()
```

Explanation of translations:
- `Scanner` is replaced with Python's `input()` function.
- Java's `long` type is not needed, just used `int` in Python for integer input.
- `System.out.println` is replaced with Python's `print` function.
- In Python, we don't need a class (`p03705`) to encapsulate the main function; so it's directly defined as `main()`.
- The `if __name__ == "__main__":` line is used in Python to execute the main function when the script is run directly.
