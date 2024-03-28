Below is the translated Java code into Python:

```python
# 8-A
def main():
    n = input()

    result = ''
    for char in n:
        if char.islower():
            result += char.upper()
        elif char.isupper():
            result += char.lower()
        # Uncomment the following lines if you want to handle spaces as well, as hinted by the original Java code
        # elif char == ' ':
        #     result += ' '
        else:
            result += char

    print(result)

if __name__ == "__main__":
    main()
```

In this Python code, we read a line of input with `input()`, we then iterate over each character, checking if each one is upper or lower case with `str.isupper()` and `str.islower()` and switching their case accordingly with `str.upper()` and `str.lower()`. Non-alphabet characters are kept the same. This uses `str` methods directly rather than `Character` methods as in Java, since these are built-in methods for string objects in Python.

Additionally, Python doesn't require defining a class to run a simple script, and the `print` function natively adds a newline, so we don't need to include `System.out.println();` like we would in Java. The main functionality is encapsulated in the `main` function by convention.
