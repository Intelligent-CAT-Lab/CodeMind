Here is the Python equivalent of the Java code:

```python
def main():
    N = int(input())
    K = int(input())

    if K % 2 == 0:
        c1 = N // K
        c2 = N // (K // 2) - c1
        print(c1 * c1 * c1 + c2 * c2 * c2)
    else:
        c = N // K
        print(c * c * c)

if __name__ == "__main__":
    main()
```

In Python, we use the `//` operator for integer division, which is equivalent to `/` in Java. The `input()` function is used to read user input, and `int()` is used to convert the input to an integer. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
