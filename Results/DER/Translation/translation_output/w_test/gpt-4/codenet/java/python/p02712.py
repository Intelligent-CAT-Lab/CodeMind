Here is the Python equivalent of the provided Java code:

```python
S = int(input())
ans = sum(i for i in range(1, S + 1) if i % 3 != 0 and i % 5 != 0)
print(ans)
```

If you provide the input `15` to this Python script, the expected output will be `60`.
