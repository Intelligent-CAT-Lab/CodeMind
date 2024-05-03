Here is the Python equivalent of the Java code:

```python
def main():
    max_num = 0
    idx = 0
    for i in range(3):
        x = int(input())
        if max_num < x:
            max_num = x
            idx = i
    print(chr(ord('A') + idx))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, compares them to find the maximum, and then prints the corresponding letter. The `chr` function is used to convert the index to a letter, and the `ord` function is used to get the ASCII value of 'A'. The `if __name__ == "__main__":` block is used to call the `main` function when the script is run directly.
