The Java code provided is a program that takes a long integer `K` and computes two values `A` and `B` such that `A = K / 50` and `B = K % 50`, and then creates an array of 50 long integers where each element has a particular value derived from these computations. It also uses a custom `FastScanner` class for input, which is designed to read from `System.in` efficiently.

Here is the equivalent Python code:

```python
import sys

def main():
    K = int(input().strip())
    A = K // 50
    B = K % 50

    a = [i + A for i in range(50)]

    for i in range(49, 49-B, -1):
        a[i] += 1

    print(50)
    for i in range(50):
        if i != 49:
            print(a[i], end=' ')
        else:
            print(a[i])

if __name__ == '__main__':
    main()
```

In Python, we do not need the `FastScanner` class used in the Java code because Python's built-in functions like `input()` and `int()` can handle file reading and parsing much more concisely. The `input().strip()` is used to read input from `stdin` and remove any leading or trailing whitespace. Additionally, list comprehensions and slicing can be used in Python to simplify array manipulation as shown in the code.
