Here is the Python equivalent of the Java code:

```python
def main():
    S = input()
    c = list(S)
    if c[0] != 'A':
        print("WA")
        return
    count = 0
    index = 0
    for i in range(2, len(c) - 1):
        if c[i] == 'C':
            count += 1
            index = i
    if count != 1:
        print("WA")
        return
    for i in range(len(c)):
        if i == 0 or i == index:
            continue
        if c[i].isupper():
            print("WA")
            return
    print("AC")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if the first character is 'A', counts the number of 'C' characters, and checks if there is exactly one 'C' character. If these conditions are not met, it prints "WA" and returns. If they are met, it checks if all other characters are lowercase letters. If they are not, it prints "WA" and returns. If all conditions are met, it prints "AC".
