Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    str = ""

    for i in range(len(s)):
        if s[i] == '.':
            str += '0'
        else:
            if s[i] == '-' and s[i + 1] == '.':
                str += '1'
            else:
                str += '2'
                i += 1

    print(str)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. If the character is a dot, it adds '0' to the string. If the character is a dash followed by a dot, it adds '1' to the string. If the character is a dash followed by anything other than a dot, it adds '2' to the string and increments the index by 1. Finally, it prints the resulting string.
