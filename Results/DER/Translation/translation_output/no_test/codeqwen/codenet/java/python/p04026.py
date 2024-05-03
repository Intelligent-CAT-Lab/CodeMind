Here is the Python equivalent of the Java code:

```python
import sys

s = input()
last = [-1] * 26
for i, ch in enumerate(s):
    ch = ord(ch) - ord('a')
    if last[ch] >= 0 and i - last[ch] < 3:
        print(last[ch] + 1, i + 1)
        sys.exit()
    last[ch] = i
print(-1, -1)
```

This Python code does the same thing as the Java code. It reads a string from the user, then iterates over each character in the string. For each character, it calculates its index in the alphabet (0-25) and checks if the last time this character was seen was within the last 3 characters. If it was, it prints the indices of the last occurrence and the current occurrence and exits the program. If it wasn't, it updates the last occurrence of the character. If no such character is found within the last 3 characters, it prints "-1 -1".
