Here is the Python equivalent of the Java code:

```python
def main():
    line = input().replace("egg", "e").replace("chicken", "c")
    line = line.replace("ee", "e e").replace("ee", "e e")
                .replace("cc", "c c").replace("cc", "c c")
    strs = line.split(" ")
    max_len = 0
    ans = ""
    for s in strs:
        if max_len < len(s):
            max_len = len(s)
            ans = "egg" if s[-1] == 'e' else "chicken"
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input, replaces "egg" with "e" and "chicken" with "c", and then splits the line into words. It then iterates over the words, keeping track of the longest word and the corresponding animal. Finally, it prints out the animal that corresponds to the longest word.
