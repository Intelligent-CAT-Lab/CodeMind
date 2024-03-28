```python
import sys
from collections import defaultdict

MOD = 998244353

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
    
    for take in range(n+1):
        b = take * x
        total_sum = take * (take - 1) // 2
        remaining_sum = (n - take) * take + total_sum
        c = b // d
        m[b % d].append([c + total_sum, c + remaining_sum])
    
    ans = 0
    for key, val in m.items():
        val.sort(key=lambda x: (x[0], x[1]))
        # merging intervals
        merged = []
        for p in val:
            if not merged:
                merged.append(p)
            else:
                if p[0] <= merged[-1][1]:
                    merged[-1][1] = max(merged[-1][1], p[1])
                else:
                    ans += merged[-1][1] - merged[-1][0] + 1
                    merged.append(p)
        ans += merged[-1][1] - merged[-1][0] + 1
    
    print(ans)

if __name__ == '__main__':
    solve()
```

