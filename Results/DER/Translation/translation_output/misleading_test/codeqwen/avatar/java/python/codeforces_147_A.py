Here is the Python equivalent of the Java code:

```python
def is_latin_letter(c):
    return 'a' <= c <= 'z'

def is_codeforces_147_A(c):
    if c == '.': return True
    if c == ',': return True
    if c == '!': return True
    if c == '?': return True
    return False

def main():
    s = input()
    sb = s[0]
    for i in range(1, len(s)):
        c = s[i]
        if is_latin_letter(c):
            if not is_latin_letter(s[i - 1]):
                sb += ' '
            sb += c
        elif is_codeforces_147_A(c):
            sb += c
    print(sb)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code: it reads a string from the user, and for each character in the string, it checks if it's a Latin letter or a special character. If it's a Latin letter, it checks if the previous character was also a Latin letter, and if not, it adds a space to the string. Then it adds the Latin letter to the string. If it's a special character, it just adds it to the string. Finally, it prints the string.
