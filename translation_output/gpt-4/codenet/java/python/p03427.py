The following is the provided Java code translated to Python:

```python
def main():
    # Input reading
    N = int(input()) + 1

    # Translating the processing logic from Java to Python
    s = str(N)
    length = len(s)
    c = int(s[0])
    max_num = (c - 1) + 9 * (length - 1)

    # Output the result
    print(max_num)

if __name__ == "__main__":
    main()
```

In this translation, the `Scanner` class from Java, which is used to read input from the console, has been replaced with the built-in `input()` function in Python. The parsing of `Long` data type in Java is done using `int()` in Python since Python's `int` type can handle long integers natively. Other string manipulations, such as getting the substring and the length of the string, directly translate to Python's string slicing and `len()` function, respectively. The `System.out.println` Java method is replaced with Python's `print()` function.
