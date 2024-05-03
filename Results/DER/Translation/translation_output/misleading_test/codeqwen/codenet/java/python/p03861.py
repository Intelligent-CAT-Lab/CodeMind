Here is the Python equivalent of the Java code:

```python
def main():
    a, b, x = map(int, input().split())
    count = b // x - a // x
    if a % x == 0:
        count += 1
    print(count)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the number of times the interval `[a, b]` is divided by `x`, and prints the result. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `map` function is used to convert the input string into a list of integers. The `input` function is used to read a line of input from the user. The `split` function is used to split the input string into a list of words, and the `int` function is used to convert each word into an integer. The `if` statement checks if `a` is divisible by `x` without a remainder, and if so, increments the count by 1. The `main` function is called when the program is run, and the `if __name__ == "__main__":` statement ensures that the `main` function is only called when the program is run directly, not when it is imported as a module.
