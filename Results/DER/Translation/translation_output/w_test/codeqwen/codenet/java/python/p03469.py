Here is the Python equivalent of the Java code:

```python
def main():
    # TODO: Add comments here

    S = input()
    c = list(S)

    print(2018, end='')
    for i in range(4, len(c)):
        print(c[i], end='')

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads a string from the user, converts it to a list of characters, prints the year 2018, and then prints the rest of the string. The `end=' '` argument to the `print` function is used to prevent a newline character from being printed after each character.
