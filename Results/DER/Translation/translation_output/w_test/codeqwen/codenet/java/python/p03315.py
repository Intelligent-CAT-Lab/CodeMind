Here is the Python equivalent of the Java code:

```python
def main():
    ary = list(input())
    num = 0
    for c in ary:
        if c == '+':
            num += 1
        else:
            num -= 1
    print(num)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, converts it into a list of characters, and then iterates over each character in the list. If the character is '+', it increments the `num` variable by 1. If the character is '-', it decrements the `num` variable by 1. Finally, it prints the value of `num`.
