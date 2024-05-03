Here is the Python equivalent of the Java code:

```python
def main():
    str_num = input()
    ch = [str_num[i] for i in range(4)]

    a = int(ch[0])
    b = int(ch[1])
    c = int(ch[2])
    d = int(ch[3])

    ans = ['+', '+', '+']

    if a + b + c + d == 7:
        pass
    elif a + b + c - d == 7:
        ans[2] = '-'
    elif a + b - c + d == 7:
        ans[1] = '-'
    elif a - b + c + d == 7:
        ans[0] = '-'
    elif a + b - c - d == 7:
        ans[2] = '-'
        ans[0] = '-'
    elif a - b + c - d == 7:
        ans[1] = '-'
        ans[0] = '-'
    elif a - b - c + d == 7:
        ans[1] = '-'
        ans[2] = '-'
    elif a - b - c - d == 7:
        ans[1] = '-'
        ans[2] = '-'
        ans[0] = '-'

    print(f"{a}{ans[0]}{b}{ans[1]}{c}{ans[2]}{d}=7")


if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string of 4 digits, converts each digit to an integer, and then checks all possible combinations of the four digits to see if they add up to 7. If a combination does add up to 7, it updates the `ans` list to reflect the combination. Finally, it prints out the combination of digits and the equals sign.
