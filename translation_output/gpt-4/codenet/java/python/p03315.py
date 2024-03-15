Here is the equivalent code in Python:

```python
# No need to import anything for input in Python

def main():
    ary = input()  # Reads the entire line as a string
    num = 0
    for c in ary:
        if c == '+':
            num += 1
        else:
            num -= 1
    print(num)

if __name__ == "__main__":
    main()
```

In Python, you don't need to convert the string to a character array explicitly, since strings are iterable and can be processed in a for-loop directly. The functionality of the `Scanner` in Java is achieved with the built-in `input()` function in Python. The rest is a straightforward translation of Java syntax to Python.
