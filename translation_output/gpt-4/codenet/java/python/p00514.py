Below is the translated code from Java to Python:

```python
import math

def main():
    a = int(input())
    b = int(input())
    c = int(input())
    if a * b > c:
        print(0)
        return
    c -= a * b
    d = c + a - 1
    bi = 1
    for i in range(c):
        bi *= d - i
        bi //= i + 1
    print(bi)

if __name__ == "__main__":
    main()
```

In the Python version:

1. The `Scanner` class is replaced with the `input()` function for reading from standard input.
2. The BigInteger operations are replaced with standard integers since Python automatically handles large integer arithmetic without overflow.
3. The `System.exit(0)` call in Java to terminate the program is not needed in Python; a `return` statement is used to exit the function early.
4. The `for` loop logic is retained with minor adjustments for Python's zero-based indexing.
5. In Python, there is no need to convert the integer to a string before printing because the `print()` function can handle various data types, including integers.
