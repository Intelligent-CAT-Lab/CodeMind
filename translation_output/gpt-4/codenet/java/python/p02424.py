Here's the equivalent code in Python:
```python
def to_string(x):
    return ''.join(str((x >> i) & 1) for i in range(31, -1, -1))

def main():
    a = int(input())
    b = int(input())
    print(to_string(a & b))
    print(to_string(a | b))
    print(to_string(a ^ b))

if __name__ == "__main__":
    main()
```

Some notes about the differences between the Java code and the Python code:

1. There is no need to import a separate `Scanner` class in Python; input is read with the `input()` function.
2. The `toString` method has been converted to a `to_string` function in Python, and uses a different method to convert the number to a binary string. It loops through each bit position and concatenates the result.
3. The `for` loop in the `to_string` function uses a generator expression to create the binary string, which is joined together with `''.join()`.
4. Python's equivalent of Java's `long` is `int`, which can hold arbitrarily large integers without overflowing.
5. Division by 2 is replaced by bitwise right-shift.
6. In Python, it is standard to define a `main` function and check if the script is being run directly using `if __name__ == "__main__":`.

