Here's the equivalent code in Python:

```python
def main():
    A = int(input())
    B = int(input())
    C = int(input())

    max_value = B + C

    if C >= B:
        C -= B
        B = 0
    else:
        B -= C
        C = 0

    if C >= A:
        C -= A
    else:
        C = 0

    print(max_value - C + 1 if C > 0 else max_value)

if __name__ == "__main__":
    main()
```

In the Python version, I use the built-in `input()` function to read from standard input and the built-in `print()` function to write to standard output. Unlike Java, we don't need to import a `Scanner` or `PrintWriter` class for these basic operations, as Python has them readily available. Also, note that Python uses indentation to define the scope of code blocks instead of braces as in Java.
