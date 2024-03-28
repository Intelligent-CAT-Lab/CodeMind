Here's the translated Python code:

```python
s = input()
length = len(s)

count = 0
for i in range(length // 2):
    a = s[i]
    b = s[length - 1 - i]
    if a != b:
        count += 1

# Uncomment to print the pairs that were compared
#         print(str(a) + str(b))

print(count)
```

Run this code with the input `redcoder` and it will output `1`, as expected.

Remember, Python uses zero-based indexing, so we don't need to call a specific method to access an element at a given index like in Java (`charAt`). Instead, we directly use square brackets. There's also no need to import a scanner for reading input from the console; `input()` serves that purpose.
