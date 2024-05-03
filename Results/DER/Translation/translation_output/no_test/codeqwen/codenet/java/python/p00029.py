Here is the Python equivalent of the Java code:

```python
import sys

s = []
for line in sys.stdin:
    s.append(line.strip())

r = [0] * len(s)
flag = [True] * len(s)
for i in range(len(s)):
    for j in range(i+1, len(s)):
        if s[i] == s[j] and flag[j]:
            r[i] += 1
            flag[j] = False

max_index = r.index(max(r))
print(s[max_index], end=" ")

max_length = max(len(word) for word in s)
for word in s:
    if len(word) == max_length:
        print(word)
```

This Python code does the same thing as the Java code. It reads a list of strings from the standard input, counts the number of occurrences of each string, and then prints the string that occurs most frequently and the longest string.
