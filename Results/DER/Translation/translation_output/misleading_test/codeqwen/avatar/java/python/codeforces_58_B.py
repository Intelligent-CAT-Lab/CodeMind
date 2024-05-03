Here is the Python equivalent of the Java code:

```python
def main():
    n = int(input())
    print(n)
    m = n
    for i in range(n - 1, 0, -1):
        if m % i == 0:
            print(i)
            m = i

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads an integer from the user, prints it, and then prints all the factors of the number in descending order. The `range` function is used to generate the sequence of numbers from `n - 1` down to `1`, and the `%` operator is used to check if `m` is divisible by `i`. If it is, `i` is printed and `m` is set to `i`. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
