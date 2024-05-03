Here is the Python equivalent of the Java code:

```python
def main():
    a = input()
    marbles = 0
    for i in range(len(a)):
        if a[i] == '1':
            marbles += 1
    print(marbles)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads a string input, counts the number of '1's in the string, and prints the count. The `if __name__ == "__main__":` block is used to call the `main()` function when the script is run directly.
