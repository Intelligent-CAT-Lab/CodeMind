Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    last = [-1] * 26
    for i in range(len(s)):
        ch = ord(s[i]) - ord('a')
        if last[ch] >= 0 and i - last[ch] < 3:
            print(last[ch] + 1, i + 1)
            return
        last[ch] = i
    print("-1 -1")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. For each character, it checks if the last occurrence of that character was within the last 3 characters. If it was, it prints the indices of the last occurrence and the current occurrence and returns. If it wasn't, it updates the last occurrence of that character. If no such pair of characters is found, it prints "-1 -1".
