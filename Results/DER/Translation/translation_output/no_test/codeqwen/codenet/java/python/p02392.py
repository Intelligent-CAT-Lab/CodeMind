Here is the Python equivalent of the Java code:

```python
def inp():
    return input()

def main():
    inStr = inp()
    inStr = inStr.strip()
    in = inStr.split(" ")

    a = int(in[0])
    b = int(in[1])
    c = int(in[2])

    if a < b and b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into three integers, and then checks if the first integer is less than the second and the second is less than the third. If it is, it prints "Yes", otherwise it prints "No".
