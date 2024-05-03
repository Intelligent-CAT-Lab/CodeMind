Here is the Python equivalent of the Java code:

```python
def main():
    X = input()
    sb = ""
    for i in range(len(X)):
        if i == 4:
            sb += " " + X[i]
        else:
            sb += X[i]
    print(sb)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads a string from the user, inserts a space after the 5th character, and then prints the resulting string.
