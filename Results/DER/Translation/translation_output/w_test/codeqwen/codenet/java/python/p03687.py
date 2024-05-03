Here is the Python equivalent of the Java code:

```python
def main():
    s = input()
    ans = 101
    for i in range(26):
        target = chr(i+ord('a'))
        max_count = 0
        cur_count = 0
        for j in range(len(s)):
            if s[j] == target:
                cur_count = 0
            else:
                cur_count += 1
                max_count = max(max_count, cur_count)
        ans = min(ans, max_count)
    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each letter of the alphabet. For each letter, it counts the number of consecutive non-target characters in the string, and keeps track of the maximum count seen so far. Finally, it prints the minimum count seen.
