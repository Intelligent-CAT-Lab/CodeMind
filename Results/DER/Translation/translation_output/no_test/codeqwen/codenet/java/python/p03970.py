Here is the Python equivalent of the Java code:

```python
def main():
    S = input()
    correct = "CODEFESTIVAL2016"
    num = 0
    for i in range(16):
        if S[i] != correct[i]:
            num += 1
    print(num)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads a string from the user, compares it to the correct string, and counts the number of characters that are different. The `if __name__ == "__main__":` line is used to call the `main()` function when the script is run directly.
