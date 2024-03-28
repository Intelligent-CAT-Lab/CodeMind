Here's the translated Python code from the given Java code:

```python
def main():
    a = int(input())
    b = int(input())
    n = b - a
    print(n * (n + 1) // 2 - b)

if __name__ == "__main__":
    main()
```

In this Python code:
- I used the `input()` function for reading user input, which is equivalent to `scanner.nextInt()` in Java after parsing the input to an integer with `int()`.
- The print function `print()` is used in place of `System.out.println()`.
- There is no need for an `import` statement to use the `input()` and `print()` functions in Python as they are built-in.
- Division in Python that should truncate towards zero (like Java's integer division), is done with the `//` operator.
