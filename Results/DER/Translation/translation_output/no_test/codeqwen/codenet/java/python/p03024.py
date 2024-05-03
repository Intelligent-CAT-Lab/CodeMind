Here is the Python equivalent of the Java code:

```python
def main():
    res = input()
    day = len(res)
    nday = 15 - day
    cnt = res.count('o')
    if (day <= 7) or ((day >= 8) and ((cnt + nday) >= 8)):
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the number of 'o' characters in the string, and then checks if the number of 'o' characters plus the number of days left until the next full week is greater than or equal to 8. If it is, it prints "YES", otherwise it prints "NO".
