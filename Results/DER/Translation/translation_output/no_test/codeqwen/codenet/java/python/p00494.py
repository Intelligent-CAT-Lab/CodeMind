Here is the Python equivalent of the Java code:

```python
def main():
    str = "$" + input() + "$"
    ans = 0
    s = 0
    for i in range(1, len(str)):
        if str[i] == 'O' and str[i - 1] != 'O':
            s = i
        if str[i] == 'O' and str[i + 1] != 'O':
            l = i - s + 1
            if s >= l and len(str) - i - 1 >= l:
                ok = True
                for j in range(l):
                    if str[s - 1 - j] != 'J' or str[i + 1 + j] != 'I':
                        ok = False
                        break
                if ok:
                    ans = max(ans, l)
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, adds a '$' at the beginning and end of the string, and then iterates over the string to find substrings of 'O's. If it finds a substring where 'O's are surrounded by 'J's on both sides, it checks if the length of the substring is greater than the current maximum length. If it is, it updates the maximum length. Finally, it prints the maximum length.
