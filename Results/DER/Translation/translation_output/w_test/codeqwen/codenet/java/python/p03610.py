Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    for i in range(0, len(s), 2):
        print(s[i], end="")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads a string from the user, then prints every second character of the string. The `end=""` argument in the `print` function is used to prevent a newline character from being added after each character.
