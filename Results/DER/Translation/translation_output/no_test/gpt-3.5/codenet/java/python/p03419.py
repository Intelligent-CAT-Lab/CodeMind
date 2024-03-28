```python
class p03419:
    def __init__(self):
        self.in = lambda: map(int, input().split())

    def solve(self):
        n, m = self.in(), self.in()
        if n == 2 or m == 2:
            print(0)
            return
        ans = max(1, n - 2) * max(1, m - 2)
        print(ans)

if __name__ == "__main__":
    p03419().solve()
```
