Here's the equivalent Python code for the provided Java code:

```python
s = input()

abc = [False] * 3
for i in range(3):
    if s[i] == 'a':
        abc[0] = True
    if s[i] == 'b':
        abc[1] = True
    if s[i] == 'c':
        abc[2] = True

isOK = all(abc)

print("Yes" if isOK else "No")
```

This Python script will read a string from the standard input, check if the first three characters include 'a', 'b', and 'c', and print "Yes" if all three characters are found, or "No" if any are missing.
