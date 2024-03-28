```python
def help(K, A, B):
    if A <= B:
        return 1 if A >= K else -1
    if A >= K:
        return 1
    dif = (A - B)
    t = (K - A) // dif + ((K - A) % dif == 0) * 0)
    return 2 * t + 1

K, A, B = map(int, input().split())
ans = help(K, A, B)
print(ans)
```
