Here's the equivalent Python code for the Java code you've provided:

```python
S = input()
correct = "CODEFESTIVAL2016"
num = 0
for i in range(16):
    if S[i] != correct[i]:
        num += 1
print(num)
```

This Python code assumes that the input string `S` has a length of 16 characters, just like the original Java code seems to assume, as it directly iterates 16 times in the for loop.
