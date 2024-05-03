Here is the Python equivalent of the Java code you provided:

```python
def main():
    s = input()
    c = sum(int(char) for char in s)
    if c % 9 == 0:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads a string from the user, calculates the sum of the digits in the string, and then checks if the sum is divisible by 9. If it is, it prints "Yes"; otherwise, it prints "No".
