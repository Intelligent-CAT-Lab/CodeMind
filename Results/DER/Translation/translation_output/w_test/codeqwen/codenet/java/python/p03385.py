Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    abc = [False, False, False]
    for i in range(3):
        if s[i] == 'a':
            abc[0] = True
        elif s[i] == 'b':
            abc[1] = True
        elif s[i] == 'c':
            abc[2] = True
    
    is_ok = all(abc)
    print("Yes" if is_ok else "No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if each character in the string is 'a', 'b', or 'c', and sets the corresponding boolean in the `abc` list to `True`. Then it checks if all the boolean values in the `abc` list are `True` using the `all()` function. If they are, it prints "Yes"; otherwise, it prints "No".
