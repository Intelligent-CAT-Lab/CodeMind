Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    res = 0
    if s[0] == 'R' and s[1] == 'R' and s[2] == 'R':
        res = 3
    elif s[0] == 'R' and s[1] == 'R':
        res = 2
    elif s[1] == 'R' and s[2] == 'R':
        res = 2
    elif s[0] == 'S' and s[1] == 'S' and s[2] == 'S':
        res = 0
    else:
        res = 1

    print(res)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, checks the first three characters of the string, and prints the result.
