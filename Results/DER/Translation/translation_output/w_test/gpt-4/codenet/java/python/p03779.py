Below is the translated code from Java to Python:

```python
x = int(input())
ans = 0

for i in range(100000):
    if x <= i * (i + 1) // 2:
        ans = i
        break

print(ans)
```

If you run this Python code with the input `6`, it should produce the expected output `3`.
