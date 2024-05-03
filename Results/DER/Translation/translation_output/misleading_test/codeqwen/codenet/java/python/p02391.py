Here is the Python equivalent of the Java code:

```python
def main():
    cmd = input()
    str_list = cmd.split()
    
    x = int(str_list[0])
    y = int(str_list[1])
    
    if x == y:
        print("a == b")
    elif x < y:
        print("a < b")
    else:
        print("a > b")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, splits it into two parts, converts them to integers, and then compares them. The `elif` keyword is used instead of `if` to handle the case where `x` is not equal to `y` and `y` is not greater than `x`.
