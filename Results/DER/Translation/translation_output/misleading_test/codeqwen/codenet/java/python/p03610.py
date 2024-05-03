Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    array = list(s)

    for i in range(0, len(s), 2):
        print(array[i], end="")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads a string from the user, splits it into a list of characters, and then prints every second character from the list. The `end=""` argument in the `print` function is used to prevent a newline character from being printed after each character.
