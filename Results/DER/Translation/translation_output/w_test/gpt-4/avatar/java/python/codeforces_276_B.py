Below is the translated Python code from the given Java code snippet:

```python
s = input()
ar = [0] * 26

for ch in s:
    ar[ord(ch) - ord('a')] += 1

cntod = sum(1 for count in ar if count % 2 != 0)

if cntod == 0:
    print("First")
else:
    if cntod % 2 == 0:
        print("Second")
    else:
        print("First")
```

When you run this translated Python code with the provided test input, it will produce the expected output "Second".
