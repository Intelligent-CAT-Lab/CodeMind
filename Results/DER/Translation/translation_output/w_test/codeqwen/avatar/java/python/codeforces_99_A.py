Here is the Python equivalent of the Java code:

```python
def solve():
    str = input()
    index = str.find(".")
    if index == -1:
        print(str)
        return
    d = int(str[index + 1])
    i = int(str[index - 1])

    if i == 9:
        print("GOTO HOME.")
        return

    if d >= 5:
        print(str[:index - 1] + str(i + 1))
    else:
        print(str[:index])


if __name__ == "__main__":
    solve()
```

This Python code does the same thing as the Java code. It reads a string from the user, finds the index of the decimal point, and then checks the digit immediately after the decimal point. If the digit is 5 or greater, it increments the digit before the decimal point by 1. If the digit is less than 5, it prints the string without the decimal point. If the digit before the decimal point is 9, it prints "GOTO HOME.". Otherwise, it prints the string without the decimal point.
