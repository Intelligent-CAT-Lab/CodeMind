Here is the Python equivalent of the Java code:

```python
def main():
    a = int(input())
    b = int(input())

    if a <= 0 and b >= 0 or a <= 0 and b >= 0:
        print("Zero")
    elif a < 0 and b < 0:
        print("Positive" if (b - a + 1) % 2 == 0 else "Negative")
    elif a > 0 and b > 0:
        print("Positive")

if __name__ == "__main__":
    main()
```

Please note that in Python, we use `input()` function to get user input, and `print()` function to print output. Also, Python uses indentation to define blocks of code, unlike Java which uses curly braces `{}`.
