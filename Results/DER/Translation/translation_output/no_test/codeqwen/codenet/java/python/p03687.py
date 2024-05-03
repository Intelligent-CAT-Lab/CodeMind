Here is the Python equivalent of the Java code:

```python
import sys

s = sys.stdin.readline().strip()
ans = 101
for i in range(26):
    target = chr(i+ord('a'))
    max_ = 0
    cur = 0
    for j in range(len(s)):
        if s[j] == target:
            cur = 0
        else:
            cur += 1
            max_ = max(max_, cur)
    ans = min(ans, max_)

print(ans)
```

This Python code does the same thing as the Java code. It reads a line of input from the standard input, then iterates over each character in the string. If the current character is the same as the target character, it resets the current count to zero. Otherwise, it increments the current count and updates the maximum count if necessary. Finally, it prints the minimum maximum count found.
