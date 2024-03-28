```python
def p03005():
    ans = 0
    n, k = map(int, input().split())

    if k == 1:
        ans = 0
    else:
        ans = n - k

    print(ans)

p03005()
```
