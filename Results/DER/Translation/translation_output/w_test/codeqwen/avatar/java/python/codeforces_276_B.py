Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    ar = [0]*26
    
    for i in range(len(s)):
        ch = s[i]
        ar[ord(ch) - ord('a')] += 1
    
    cntod = 0
    for i in range(26):
        if (ar[i] % 2) != 0:
            cntod += 1
    
    if cntod == 0:
        print("First")
    else:
        if cntod % 2 == 0:
            print("Second")
        else:
            print("First")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, counts the occurrences of each character in the string, and then checks if the number of characters with odd counts is even or odd. If it's even, it prints "Second", otherwise it prints "First".
