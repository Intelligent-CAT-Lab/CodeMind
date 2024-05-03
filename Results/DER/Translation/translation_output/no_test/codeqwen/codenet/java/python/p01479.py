Here is the Python equivalent of the Java code:

```python
def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = line.replace("ee", "e e").replace("ee", "e e")
              .replace("cc", "c c").replace("cc", "c c")
    strs = line.split(" ")
    max_len = 0
    ans = ""
    for word in strs:
        if max_len < len(word):
            max_len = len(word)
            ans = word[-1] == 'e' and "egg" or "chicken"
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, replaces certain words with other words, splits the line into words, and then finds the longest word. If the last character of the longest word is 'e', it prints "egg", otherwise it prints "chicken".
