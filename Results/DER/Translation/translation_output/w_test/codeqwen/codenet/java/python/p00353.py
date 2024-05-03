Here is the Python equivalent of the Java code:

```python
def main():
    input_str = input()
    input_list = input_str.split()
    m = int(input_list[0])
    f = int(input_list[1])
    b = int(input_list[2])

    if b > m + f:
        print("NA")
    elif b > m:
        print(b - m)
    else:
        print("0")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into a list of strings, converts each string to an integer, and then performs the same logic as the Java code.
