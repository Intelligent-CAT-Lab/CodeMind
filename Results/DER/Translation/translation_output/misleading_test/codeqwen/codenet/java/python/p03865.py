Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    a = len(s)
    
    if s[0] == s[a-1]:
        if a % 2 == 1:
            print("Second")
        else:
            print("First")
    else:
        if a % 2 == 1:
            print("First")
        else:
            print("Second")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if the first and last characters are the same, and then determines whether the string belongs to the "First" or "Second" category based on the length of the string.
