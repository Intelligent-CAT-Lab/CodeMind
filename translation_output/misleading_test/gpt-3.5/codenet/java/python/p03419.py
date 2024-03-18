```python
class p03419:

    def solve(self):
        n, m = map(int, input().split())
        if n == 2 or m == 2:
            print(0)
            return
        ans = max(1, n - 2) * max(1, m - 2)
        print(ans)

p = p03419()
p.solve()
```
