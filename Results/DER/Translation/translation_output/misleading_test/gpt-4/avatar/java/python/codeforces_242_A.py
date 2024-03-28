Here's the translated code from Java to Python:

```python
x, y, a, b = map(int, input().split())
res = []
for i in range(a, x + 1):
    for j in range(b, y + 1):
        if i <= j:
            continue
        res.append(f"{i} {j}")

print(len(res))
for elem in res:
    print(elem)
```

You can use this Python script to get the expected output for the provided test case. Just run the script, input your test case, and it should produce the result you're looking for.
