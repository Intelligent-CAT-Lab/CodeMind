Here is the Python equivalent of the Java code:

```python
def main():
    ary = input().strip()
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

This Python code does the same thing as the Java code. It reads a string from the user, iterates over each character in the string, and increments or decrements a counter based on whether the character is a '+' or a '-'. Finally, it prints the value of the counter.
