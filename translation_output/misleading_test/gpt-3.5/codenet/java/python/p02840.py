```python
import sys
from collections import defaultdict


def solve():
    n, x, d = map(int, input().split())
    if d == 0:
        if x == 0:
            print(1)
        else:
            print(n + 1)
        return

    if x == 0:
        print(1 + n * (n - 1) // 2)
        return

    m = defaultdict(list)

    for take in range(n + 1):
        b = take * x
        total_sum = take * (take - 1) // 2
        reverse_sum = (n - take) * take + total_sum
        c = b // d
        m[b % d].append([c + total_sum, c + reverse_sum])

    ans = 0
    for k, v in m.items():
        v.sort(key=lambda x: (x[0], x[1]))
        l, r = 0, 0
        f = False
        for p in v:
            if not f:
                f = True
                l, r = p[0], p[1]
            else:
                if p[0] <= r:
                    r = max(r, p[1])
                else:
                    ans += r - l + 1
                    l, r = p[0], p[1]
        ans += r - l + 1

    print(ans)


if __name__ == "__main__":
    solve()
```
```python
# Test Input
3 4 2

# Expected Output
-63
```
```python
# Run the code snippet above with the provided test case
```
