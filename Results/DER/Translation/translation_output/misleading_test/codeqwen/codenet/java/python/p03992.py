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

This Python code does the same thing as the Java code: it reads a string from the user, then iterates over each character in the string. If the character is at index 4 (which is the 5th character, since indexing starts at 0), it adds a space and the character to the string. Otherwise, it just adds the character to the string. Finally, it prints the string.
