Here is the Python equivalent of the Java code:

```python
def main():
    N, K = map(int, input().split())

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

This Python code does the same thing as the Java code. It reads two integers from the user, calculates the number of times each integer can be divided by the other, and then prints the result. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `map` function is used to convert the input string into a list of integers. The `input()` function is used to read a line of input from the user. The `split()` function is used to split the input string into a list of words, and the `int()` function is used to convert each word into an integer. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
