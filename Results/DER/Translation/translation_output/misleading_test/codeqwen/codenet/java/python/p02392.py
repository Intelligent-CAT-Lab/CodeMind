Here is the Python equivalent of the Java code:

```python
def main():
    inStr = input()
    inStr = inStr.strip()
    inStr = inStr.split(" ")

    a = int(inStr[0])
    b = int(inStr[1])
    c = int(inStr[2])

    if a < b and b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into three parts, converts them to integers, and then checks if the first number is less than the second, and if the second is less than the third. If it is, it prints "Yes", otherwise it prints "No".
