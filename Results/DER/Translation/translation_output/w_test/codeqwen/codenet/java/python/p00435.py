Here is the Python equivalent of the Java code:

```python
def main():
    s = ""
    for c in input():
        s += chr((ord(c) - 42) % 26 + 65)
    print(s)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then for each character in the string, it subtracts 42 from the ASCII value of the character, takes the modulus of 26 of the result, and adds 65 back to the result. This gives the ASCII value of the character that is 42 places ahead of the original character in the alphabet. It then converts this ASCII value back to a character and appends it to the string. Finally, it prints the resulting string.
