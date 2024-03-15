Here's the equivalent Python code for the Java snippet you provided:

```python
def main():
    mem = [0] * 10
    pos = 0
    sb = []
    s = input()
    for c in s:
        idx = (ord(c) - 33) // 10
        for i in range(abs(pos - idx)):
            sb.append('<' if idx < pos else '>')
        pos = idx
        for i in range(abs(mem[pos] - ord(c))):
            sb.append('-' if ord(c) < mem[pos] else '+')
        mem[pos] = ord(c)
        sb.append('.')
    print(''.join(sb))

if __name__ == '__main__':
    main()
```

In the Python code:

- We replace the `Scanner` class with Python's `input()` function.
- We replace the `StringBuilder` class with a Python list `sb` to which we append characters and later join them into a string.
- We replace Java's `char` type by using `ord()` on the strings in Python to get the ASCII integer value.
- Java's array is replaced by creating a list in Python with an initial size of 10 and initialized to zero using list multiplication.
- The `main` function is invoked only when the module is run as the main program, indicated by `if __name__ == '__main__':`. This convention is not required in Java.
