Below is the translated Python code for the given Java code:

```python
n = int(input())
ans = 0

for i in range(1, n + 1):
    if i % 2 == 1:
        divcount = 0
        for k in range(1, n + 1):
            if i % k == 0:
                divcount += 1
        if divcount == 8:
            ans += 1
            # print(i) # for debugging - to check the current value

print(ans)
```

Now, let's test the Python code with the provided test input (105):

```python
# Sample test case
n = 105
ans = 0

for i in range(1, n + 1):
    if i % 2 == 1:
        divcount = 0
        for k in range(1, n + 1):
            if i % k == 0:
                divcount += 1
        if divcount == 8:
            ans += 1

print(ans)  # Expected output: 1
```

When you run this Python code with the input `105`, it should produce the expected output `1`.
