Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    s = sorted(s)
    if s[0] == s[1] and s[2] == s[3] and s[1] != s[2]:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, sorts the characters in the string, and then checks if the first two characters are the same, the second two characters are the same, and the first two characters are not the same. If all these conditions are met, it prints "Yes", otherwise it prints "No".
