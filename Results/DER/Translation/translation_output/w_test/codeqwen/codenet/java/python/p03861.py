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

This Python code does the same thing as the Java code. It reads three integers from the user, calculates the number of times the interval `[a, b]` is divided by `x`, and prints the result. The `//` operator is used for integer division in Python, which is equivalent to `/` in Java. The `map` function is used to convert the input strings to integers. The `if` statement checks if `a` is divisible by `x` without a remainder, and if so, increments the count by 1.
