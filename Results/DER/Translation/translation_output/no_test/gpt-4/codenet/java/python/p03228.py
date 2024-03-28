Below is the translated Java code into Python. Note that in Python, the `input()` function is used to take input from the user, and it always returns a string, so it needs to be converted to an integer using `int()` when you're expecting an integer input.

```python
# Welcome to the online interpreter.
# This online interpreter supports various languages including Python.

def main():
    a = int(input())
    b = int(input())
    op = int(input())

    for i in range(op):
        if i % 2 == 0:
            b += a // 2
            a //= 2
        else:
            a += b // 2
            b //= 2

    print(a)
    print(b)

if __name__ == "__main__":
    main()
```

Just copy and paste this Python code into your interpreter, and it should work similarly to the Java version. The `//` operator is used for integer division in Python, which is equivalent to the `/` operator in Java when used with integers.
