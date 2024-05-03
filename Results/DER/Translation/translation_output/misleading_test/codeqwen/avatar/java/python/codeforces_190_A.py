Here is the Python equivalent of the Java code:

```python
def main():
    n, m = map(int, input().split())

    if n == 0:
        if m != 0:
            print("Impossible")
        else:
            print(0, 0)
        return

    if m <= n:
        if m == 0:
            m = 1
        print(n, m + n - 1)
        return

    print(m, m + n - 1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the user, checks if they are valid, and then prints the result. The `map` function is used to convert the input string into a list of integers. The `input().split()` function is used to split the input string into a list of strings, which are then converted into integers using the `map` function. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
