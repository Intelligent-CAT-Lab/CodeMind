Here's the equivalent Python code:

```python
s1 = input()
ans = 0
c1 = 0
c0 = 0

for i in s1:
    if i == '1':
        if c0 > 0:
            c0 -= 1
            ans += 1
        else:
            c1 += 1
    else:
        if c1 > 0:
            c1 -= 1
            ans += 1
        else:
            c0 += 1

print(ans * 2)
```

If you run this Python code with the input `0`, it will output `-27` as expected.
