Here is the Python equivalent of the Java code:

```python
def main():
    max_num = 0
    max_idx = 0
    for i in range(3):
        x = int(input())
        if max_num < x:
            max_num = x
            max_idx = i
    print(chr(ord('A') + max_idx))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, compares them to find the maximum, and then prints the corresponding letter. The `ord` function is used to get the ASCII value of the character 'A', and the `chr` function is used to convert the ASCII value back to a character. The `range(3)` function generates a sequence of numbers from 0 to 2, which is used to iterate over the three integers. The `input` function is used to read the integers from the user, and the `int` function is used to convert the input strings to integers.
