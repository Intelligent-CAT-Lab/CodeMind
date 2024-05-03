Here is the Python equivalent of the Java code:

```python
def main():
    question = input().strip()
    original_q = question[:-1].strip()
    ch = original_q[-1]
    vowels = ["A", "E", "I", "O", "U", "Y"]
    if ch.upper() in vowels:
        print("YES")
    else:
        print("NO")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, strips any leading or trailing whitespace, and then checks if the last character is a vowel. If it is, it prints "YES"; otherwise, it prints "NO".
