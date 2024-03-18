```python
import sys

class p02251:
    def solve(self):
        n = int(input())
        ans = 0

        # 25 cent
        ans += n // 25
        n %= 25

        # 10 cent
        ans += n // 10
        n %= 10

        # 5 cent
        ans += n // 5
        n %= 5

        # 1 cent
        ans += n

        print(ans)

def main():
    p = p02251()
    p.solve()

if __name__ == "__main__":
    main()
```

Test input:
```python
100
```

Expected output:
```python
82
```
