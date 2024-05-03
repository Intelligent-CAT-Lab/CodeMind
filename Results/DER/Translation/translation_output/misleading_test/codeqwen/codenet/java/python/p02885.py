Here is the Python equivalent of the Java code:

```python
def main():
    line = input()
    line1 = line.split(" ")
    a = int(line1[0])
    b = int(line1[1])
    if a > 2 * b:
        print(a - 2 * b)
    else:
        print(0)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into two parts, converts them to integers, and then checks if the first integer is greater than twice the second integer. If it is, it prints the difference; otherwise, it prints 0.
