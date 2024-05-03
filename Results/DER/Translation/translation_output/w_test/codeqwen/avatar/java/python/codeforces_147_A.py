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

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. If the character is a Latin letter, it checks if the previous character was also a Latin letter. If not, it adds a space to the string. Then it adds the Latin letter to the string. If the character is not a Latin letter and not a punctuation mark, it just adds the character to the string. Finally, it prints the string.
