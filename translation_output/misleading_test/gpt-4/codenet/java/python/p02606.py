Here is the translated code from Java to Python:

```python
L, R, d = map(int, input().split())

Ans = 0
for i in range(L, R + 1):
    if i % d == 0:
        Ans += 1

print(Ans)
```

You can use the provided inputs as follows:
```
5 10 2
```

And you should expect the output:
```
68
```
